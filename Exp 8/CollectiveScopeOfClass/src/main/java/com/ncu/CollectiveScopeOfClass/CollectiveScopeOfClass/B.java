package com.ncu.CollectiveScopeOfClass.CollectiveScopeOfClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bclass")
@Scope("singleton")
public class B {
	@Autowired
	private A a;
	public A getA() {
		return a;
	}
	public void setA(A a) {
		this.a = a;
	}
	@Autowired
	B()
	{		System.out.println("inside B");	}
	

}
