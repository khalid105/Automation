package SuperKeyword;


class CarSr1
{
	String color = "Blue";
}

class CarSr2 extends CarSr1
{
	String color = "White";
	
	public void getDetails()
	{
		System.out.println(super.color);
	}
}

public class SuperWithVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarSr2 c = new CarSr2();
		c.getDetails();
		
		

	}

}
