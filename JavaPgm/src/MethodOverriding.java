class MOR
{
	public void Shape()
	{
		System.out.println("Circle");
	}
}

class MOR1 extends MOR
{
	
	
	public void Shape()
	{
		System.out.println("Tringle");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MOR1 m = new MOR1();
		m.Shape();

	}

}
