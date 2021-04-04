package abstractFactoryPattern;

public class MumbaiMonthlySubs implements Subscription{

	public int price = 219;
	@Override
	public int getPrice() {
		
		return price;
	}

	@Override
	public void enroll() {
		
		System.out.println("Enrolled in Mumbai for Monthly Subscription");
		
	}

}
