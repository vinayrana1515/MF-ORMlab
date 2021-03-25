package com.ncu.LC;

public class TestRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IWorker sw = new SmartWorker(); //Upcasting 
		Manager mn = new Manager(sw); //passing smartworker object
		mn.ManageWork();
		IWorker lw = new LazyWorker(); //Upcasting 
		Manager mn2 = new Manager(lw);//passing lazyworker object
		mn2.ManageWork(); 
		IWorker ew = new ExtraOrdinaryWorker(); //Upcasting 
		Manager mn3 = new Manager(ew); //passing extraordinaryworker object
		mn3.ManageWork(); 


	}

}
