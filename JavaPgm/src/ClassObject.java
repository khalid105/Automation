 class Booking
{
	 
	 public void Flight()
	 {
		 System.out.println("FlightBooking");
	 }
	
}


public class ClassObject {
	
	public void Image() //User define method and we can change any number of time
	{
		System.out.println("Tringle");
	}
	
	public void Image2()
	{
		System.out.println("Circle");
	}

	
	//Java define method and we cant chnage - it should be one only
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Testing");
		
		//Object Creation
		
		//classname ref = new Constructor();
		//ref.userdefinemethod()
		
		ClassObject  c = new ClassObject();
		c.Image();
		c.Image2();
		
		Booking b = new Booking();
		b.Flight();
		
		
	}

}
