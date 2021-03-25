package com.ncu.TC;
import java.util.*;
public class Factory {
	private static ResourceBundle rb = ResourceBundle.getBundle("config");
			private Factory() {}
			//function for getting object of the class given in file config.properties
			static IWorker getObject() {
			Object object = null;
			//fetching the class name from key value pair given in getString method
			String className = rb.getString("class-name");
			try {
			//creating the object for the class name value
			object = Class.forName(className).getDeclaredConstructor().newInstance();
			}catch(Exception e) {
			}//object creation required exception handling
			return (IWorker)object;

}
}