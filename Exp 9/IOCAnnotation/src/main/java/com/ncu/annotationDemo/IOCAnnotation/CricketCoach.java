package com.ncu.annotationDemo.IOCAnnotation;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ccoach")
public class CricketCoach implements Coach{
private IFortune ifortune;

@Autowired
public CricketCoach(IFortune ifortune) {
	this.ifortune=ifortune;
}        public String getDailyWorkout() {  	return "do strecthing today";  }

@PreDestroy
public void destroyMethod() {	System.out.println("inside destroy");}
@PostConstruct
public void initMethod() {
	System.out.println("inside init");
}

@Override
public String getDailyFortune() {
	// TODO Auto-generated method stub
	return ifortune.getFortune();
}
}