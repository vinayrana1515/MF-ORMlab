package consumerProducer;

public class Consumer {
	public static void main(String[] args) {
		
			IProducer p = Factory.getObject();
			p.speed();
		}

}
