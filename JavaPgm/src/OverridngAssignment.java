/*
 Method Over riding :- We have to apply same methods but it should be in different classes
and we can achive with the help of extends keyword and Implementation should be different
 */
class BankOfAmerica
{
	final public void CompanyLogo() {
	}
	public void EmpPayOutByLocation() {
		System.out.println("Employee Pay Out by local Currency");
	}
}
class BankOfAmericaUK extends BankOfAmerica
{
	public void EmpPayOutByLocation() {
		System.out.println("Employee get paid by Pound's");
	}
}
class BankOfAmericaIndia extends BankOfAmerica
{
	public void EmpPayOutByLocation() {
		System.out.println("Employee get paid by Rupee's");
	}
}
public class OverridngAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankOfAmericaIndia obj = new BankOfAmericaIndia();
		obj.CompanyLogo();
		obj.EmpPayOutByLocation();

	}

}
