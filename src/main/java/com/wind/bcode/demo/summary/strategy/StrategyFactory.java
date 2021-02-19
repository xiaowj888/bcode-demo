package com.wind.bcode.demo.summary.strategy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class StrategyFactory implements ApplicationContextAware {
    //key为策略的value 值为bean的应用
    private final Map<String,Object> strategyMap = new HashMap<>();
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //获取所有注解的实现
        Map<String, Object> beansWithAnnotationMap = applicationContext.getBeansWithAnnotation(Strategy.class);
        beansWithAnnotationMap.forEach((beanName,strategyBean) -> {
            //获取bean上的注解
            Strategy strategyAnnotation = applicationContext.findAnnotationOnBean(beanName, Strategy.class);
            if(null == strategyAnnotation){
                return;
            }
            for(String value:strategyAnnotation.values()){
                strategyMap.put(value,strategyBean);
            }
        });
    }

    public <T> T getStrategy(String strategyValue, Class<T> strategyInterface){
        Object strategyBean = strategyMap.get(strategyValue);
        if(null == strategyBean){
            throw new RuntimeException(String.format("没有找到策略【%s】",strategyValue));
        }
        if(! (strategyInterface.isAssignableFrom(strategyBean.getClass()))){
            throw new RuntimeException(String.format("策略【%s】类型【%s】与真实类型【%s】不匹配",strategyValue,
                    strategyBean.getClass().getCanonicalName(),strategyInterface.getCanonicalName()));
        }
        return (T)strategyBean;
    }
}
