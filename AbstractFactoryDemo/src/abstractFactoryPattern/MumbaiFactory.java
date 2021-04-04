package abstractFactoryPattern;

public class MumbaiFactory implements AbstractFactory{
	
	@Override
	public Subscription getSubscription(String subscriptionType) {
		
		if(subscriptionType.equalsIgnoreCase("weekly"))
		{
			return new MumbaiWeeklySubs();
		}
		else if(subscriptionType.equalsIgnoreCase("monthly"))
		{
			return new MumbaiMonthlySubs();
		}
		else if(subscriptionType.equalsIgnoreCase("yearly"))
		{
			return new MumbaiYearlySubs();
		}
		else
		{
			return null;
		}
	}

}
