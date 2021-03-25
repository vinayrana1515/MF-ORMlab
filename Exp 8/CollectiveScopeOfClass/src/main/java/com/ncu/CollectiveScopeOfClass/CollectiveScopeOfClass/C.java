package com.ncu.CollectiveScopeOfClass.CollectiveScopeOfClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("class")
@Scope("prototype")
public class C {
     @Autowired
	C()
	{
		System.out.println("inside C");}
}
