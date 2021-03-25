package com.ncu.FactoryClass;

public class Factory {
	private Factory() {}
	//getObject will return object of type Iworker
	public static IWorker getObject() {
	return new SmartWorker();//returning object
	}

}
