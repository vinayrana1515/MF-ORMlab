package com.ncu.CollectiveScopeOfClass.CollectiveScopeOfClass;

import java.util.LinkedList;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
@Component
public class DestroyPrototypeBeans implements BeanPostProcessor, ApplicationContextAware, DisposableBean 
{
	private ApplicationContext ac;
	
	private final LinkedList<Object> prototypeBeans = new LinkedList<>();
	
	public Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException 
	{
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException
	{
		//System.out.println("In after initialisation "+beanName);
		if(ac.isPrototype(beanName))
		{
			synchronized(prototypeBeans)
			{
				prototypeBeans.add(bean);
			}
		}
		return bean;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		synchronized (prototypeBeans) {
            for (Object bean : prototypeBeans) {
                if (bean instanceof DisposableBean) {
                    DisposableBean disposable = (DisposableBean)bean;
                    try {
                        disposable.destroy();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            prototypeBeans.clear();
        }
    }
		 

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.ac=applicationContext;
	}

}
