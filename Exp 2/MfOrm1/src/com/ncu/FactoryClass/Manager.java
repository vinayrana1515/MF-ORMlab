package com.ncu.FactoryClass;

public class Manager {
	IWorker worker; //Interface Object
	public Manager(IWorker worker) 
	{ 
	this.worker=worker; 
	} 
	public void ManageWork() 
	{ 
	this.worker.work(); 
	} 


}
