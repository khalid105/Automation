class KFCAmerica
/* Method Over riding :- We have to apply same methods but it should be in different classes
and we can achive with the help of extends keyword and Implementation should be different
 */
{
	final public void Product()
	{
		System.out.println("KFC ");
	}
	
	public void Location()
	{
		System.out.println("California");
	}
}

class KFCUK extends KFCAmerica
{
	
	public void LocalPizza()
	{
		System.out.println("available in uk branch");
	}
	public void Location()
	{
		System.out.println("London");
	}
	
	
}

class KFCIndia extends KFCAmerica
{
	public void Location()
	{
		System.out.println("Hyderabad");
	}
}
public class OverridngRealTime {

	public static void main(String[] args) {
		// Run Time Polymorphism -- Method Over riding , Upcasting
		
		KFCAmerica k = new KFCUK();
		k.Location();
		k.Product();
		//k.LocalPizza();

	}

}
