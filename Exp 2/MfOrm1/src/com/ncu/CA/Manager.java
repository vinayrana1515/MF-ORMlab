package com.ncu.CA;

public class Manager {
SmartWorker sw;
LazyWorker lw;
ExtraOrdinaryWorker ew;


Manager(SmartWorker sw, LazyWorker lw,ExtraOrdinaryWorker ew) 
{ 
this.sw = sw; 
this.lw = lw; 
this.ew = ew;//add 
} 
public void ManageWork() { 
sw.work(); 
lw.work(); 
ew.work();//make call }
	
}
}