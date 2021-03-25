package com.ncu.FactoryClass;

public class TestRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IWorker sw = Factory.getObject() ;
		Manager mn = new Manager(sw); //passing smartworker object
		mn.ManageWork();
		}


	}


