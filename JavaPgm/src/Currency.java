class Country {
	public void CurrencyGeneration() {
		System.out.println("The each Countries Currency depends on GDP: ");

	}
}
//class Country extends Country
//{
//	public void CurrencyExchange() {
//		System.out.println("Country Exchange Rate");
//		
//	}
//}

class USA extends Country {
	public void RunningCurrency() {
		System.out.println("The USA's currency is $Dollar");

	}
}

class India extends Country {
	public void RunningCurrency() {
		System.out.println("The India's currency is Rupee");

	}
}

class UK extends Country {
	public void RunningCurrency() {
		System.out.println("The Uk's currency is Pound");

	}
}

public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Can we access all methods just creating the object for UK class?
		//Country ct = new Country();
		UK ukc = new UK();
//		USA us= new USA();
//		India ind = new India();
		//ct.CurrencyExchange();
		//us.CurrencyExchange();
		//ind.CurrencyExchange();
		ukc.CurrencyGeneration();
		ukc.RunningCurrency();
		
		

	}

}
