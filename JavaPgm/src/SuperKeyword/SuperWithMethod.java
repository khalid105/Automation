package SuperKeyword;

class Car1
{
	public void getColor()
	{
		System.out.println("Blue");
	}
	
	public void getEngine()
	{
		System.out.println("1500 CC");
	}
	
	public void AirBag()
	{
		System.out.println("Available in Top Variant");
	}
}

class Car2 extends Car1
{
	public void getColor()
	{
		System.out.println("Red");
	}
	
	public void getEngine()
	{
		System.out.println("1800 CC");
	}
	
	public void AirBag()
	{
		System.out.println("Available in Top Variant and Automatic Variant");
	}
	
	public void getDetails()
	{
		getColor();
		super.getEngine();
		AirBag();
	}
	
	
}

public class SuperWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car2 c = new Car2();
		c.getDetails();

	}

}
