package com.ncu.LC;

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
