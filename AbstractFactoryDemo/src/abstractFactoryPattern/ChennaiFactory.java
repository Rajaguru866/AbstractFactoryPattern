package abstractFactoryPattern;



public class ChennaiFactory implements AbstractFactory{

	@Override
	public Subscription getSubscription(String subscriptionType) {
		
		if(subscriptionType.equalsIgnoreCase("weekly"))
		{
			return new ChennaiWeeklySubs();
		}
		else if(subscriptionType.equalsIgnoreCase("monthly"))
		{
			return new ChennaiMonthlySubs();
		}
		else if(subscriptionType.equalsIgnoreCase("yearly"))
		{
			return new ChennaiYearlySubs();
		}
		else
		{
			return null;
		}
	}
	
	

}
