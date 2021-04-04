package abstractFactoryPattern;

public class ChennaiWeeklySubs implements Subscription{

	public int price = 49;
	@Override
	public int getPrice() {
		
		return price;
	}

	@Override
	public void enroll() {
		
		System.out.println("Enrolled in Chennai for Weekly Subscription");
		
	}

}
