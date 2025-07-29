package AbstractConcept;


abstract class Apple
{
	//Non Abstract method which has body like {}
	public void Image()
	{
		System.out.println("Circle");
	}
	
	//Abstract method which has NO body like {}
	abstract public void Shape();
	
}

class CDE extends Apple
{

	@Override
	public void Shape() {
		// TODO Auto-generated method stub
		System.out.println("Tringle");
		
	}
	
}

  public class AbstractConceptPractice1 {
	
	public static void main(String[] args) {
		CDE a = new CDE();
		a.Shape();
		a.Image();
		

	}

}
