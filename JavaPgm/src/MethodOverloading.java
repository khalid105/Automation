class MOL
/* Method Over loading:- we have to apply same methods but it should be in same class 
but signature/Parameter/Data type should be different
*/
{
	public void Test(int a,String b)
	{
		System.out.println("calling Int and String");
	}
	
	public void Test(String a , int b)
	{
		System.out.println("calling String and int");
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// Compile Time Polymorphism  - Method Over loading
		
		MOL m = new MOL();
		m.Test(11,"ABC");
		m.Test("DEF", 14);

	}

}
