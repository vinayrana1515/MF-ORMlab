package com.ncu.CollectiveScopeOfClass.CollectiveScopeOfClass;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("aclass")
@Scope("prototype")
public class A implements DisposableBean{
//    @Autowired
	A(){		System.out.println("Inside A");	}
	@Autowired
	private B b;
	
	@PostConstruct
    public void initMethod() {	  System.out.println("inside init Method");  } 
	
	public B getB() {		return b;	}
	
	public void setB(B b) {		this.b = b;	}
	@PreDestroy
	
	public void destroy()  {		System.out.println("inside Destroy Method");	}

}
