class Cons
{
	/* Construtcor name and class name should be same

	if user is not declaring any constructor  jvm will call default and blank constructor

	if user is declaring any constructor - jvm will not call default and blank constructor

	constructor doesnt contains any return type - like void
	 */
	
	 Cons(String a)
	{
		System.out.println("calling Constructor "+a);
	}
	
	Cons(int a )
	{
		System.out.println("calling int");
	}
	
	Cons(double b)
	{
		System.out.println("Calling double");
	}
//	public void Image()
//	{
//		System.out.println("Tringle");
//	}
}

//class Cons1 extends Cons
//{
//	
//}


public class ConstructorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 	 new Cons(10.5);
	Cons c =	 new Cons(20);
		// new Cons("ABC");
		//c.Image();
	//c.Cons("ABC");

	}

}
