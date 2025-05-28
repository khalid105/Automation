//We use constructorer when there n-need for reusability and within a same class
//The Constructor overloading

class Cons2 {
	Cons2(int a, long b) {
		System.out.println("Calling Constructor" + a + b);
	}
	
	Cons2(long a , int b)
	{
		System.out.println("Calling Long and Int Const");
	}
	Cons2(int a , double b)
	{
		System.out.println("Calling Int and Double Const");
	}
	Cons2(boolean a , char b)
	{
		System.out.println("Calling Boolean and Char Const");
	}
	Cons2(short a, byte b)
	{
		System.out.println("Calling Short and Byte");
	}

}

public class ConstructorAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Cons2(2, 10L);
		new Cons2(100L,10);
		new Cons2(20,200.5); // By Default hole num-int and Decimal=Double
		new Cons2(true,'K');
		new Cons2((short)3,(byte)1);//How to call short and byte?

	}

}
