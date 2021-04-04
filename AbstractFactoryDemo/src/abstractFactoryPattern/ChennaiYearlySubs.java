package abstractFactoryPattern;

public class ChennaiYearlySubs implements Subscription{

	public int price = 2199;
	@Override
	public int getPrice() {
		
		return price;
	}

	@Override
	public void enroll() {
		
		System.out.println("Enrolled in Chennai for Yearly Subscription");
	}

}
