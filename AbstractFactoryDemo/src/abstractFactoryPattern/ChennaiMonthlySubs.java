package abstractFactoryPattern;

public class ChennaiMonthlySubs implements Subscription{

	public int price = 199;
	@Override
	public int getPrice() {
		
		return price;
	}

	@Override
	public void enroll() {
		
		System.out.println("Enrolled in Chennai for Monthly Subscription");
		
	}

}
