package consumerProducer;
import java.util.*;
public class Factory {	
		private static ResourceBundle rb=ResourceBundle.getBundle("config");
			
			private Factory() {}
			
			static IProducer getObject()
			{
				Object object=null;
				String className=rb.getString("classname");

			try
			{
				object=Class.forName(className).getDeclaredConstructor().newInstance();
				
			}
			catch(Exception e) 
			{
			}
			return (IProducer) object;
			}
}