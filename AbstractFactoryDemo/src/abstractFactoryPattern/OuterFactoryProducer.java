package abstractFactoryPattern;

public class OuterFactoryProducer {
	
	public static AbstractFactory getCity(String city)
	{
		if(city.equalsIgnoreCase("chennai"))
		{
			return new ChennaiFactory();
		}
		else if(city.equalsIgnoreCase("mumbai"))
		{
			return new MumbaiFactory();
		}
		return null;
		
	}

}
