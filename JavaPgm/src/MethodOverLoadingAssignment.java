
/*Method Over loading :- we have to apply same methods but it should be in same class 
but signature/Parameter/Data type should be different
*/

class MOL2
{
	public void QaTest(int a, String b) {
		System.out.println("Calling the Ind and String PRM");
	}
	public void QaTest(float c, double d) {
		System.out.println("Calling the Float and Double");
		
	}
}
public class MethodOverLoadingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MOL2 obj = new MOL2();
		obj.QaTest(2, 100);
		obj.QaTest(6, "Khalid");
	}

}
