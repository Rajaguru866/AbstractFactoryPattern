package abstractFactoryPattern;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		
		AbstractFactory city = OuterFactoryProducer.getCity("mumbai");
		Subscription sub = city.getSubscription("yearly");
		System.out.println("Subscription Price is " + sub.getPrice());
		sub.enroll();
	}

}
    
