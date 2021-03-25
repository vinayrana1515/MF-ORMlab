package com.ncu.CA;

public class TestRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartWorker sw = new SmartWorker(); 
		LazyWorker lw = new LazyWorker(); 
		ExtraOrdinaryWorker ew= new ExtraOrdinaryWorker();
		Manager mn = new Manager(sw, lw,ew); 
		mn.ManageWork(); 


	}

}
