package statickeyword;

 class Shape
{
	static String image = "Circle";
	
	public static void  getImage()
	{
		System.out.println("Sqaure");
	}
	
	 class ABC
	{
		
	}
}

public class Variableconcept {
	
	 static String color = "Blue";
	
	public static void getColor()
	{
		System.out.println("Purple");
	}

	public static void main(String[] args) {
		
		//Variableconcept v = new Variableconcept();
		
		//System.out.println(v.color);
		
		
		System.out.println(color);
		
		
		System.out.println(Shape.image);
		
		getColor();
		
		Shape.getImage();
		
		

	}

}
