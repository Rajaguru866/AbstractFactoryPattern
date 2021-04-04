package abstractFactoryPattern;

public class MumbaiYearlySubs implements Subscription{
	
	public int price = 2299;
	
	@Override
	public int getPrice() {
		
		return price;
	}

	@Override
	public void enroll() {
		
		System.out.println("Enrolled in Mumbai for Yearly Subscription");
		
	}

}
