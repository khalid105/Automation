package AbstractConcept;

 abstract class Abs
{
	
	public void Image()  //Non Abstract method
	{
		System.out.println("circle");
	}
	
	abstract public void Shape(); //Abstract method
	
}
 
 class ABC extends Abs
 {

	@Override
	public void Shape() {
		// TODO Auto-generated method stub
		
		System.out.println("Tringle");
		
	}
	 
 }

public class AbstractConc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Abs a = new Abs();
		
		ABC a = new ABC();
		a.Shape();
		
		a.Image();
		

	}

}
