class Arithmattics {
	public void types() {
		System.out.println("Categoty");

	}
}

class Addition extends Arithmattics {
	public void AdditionOfTwoNumbers() {
		System.out.println("The AdditionOfTwoNumbers Method");
	}

}

class Subtracttion extends Addition {
	public void SubtractionOfTwoNumbers() {
		System.out.println("The SubtractionOfTwoNumbers Method");
	}
}

class Multiplication extends Subtracttion {
	public void MultiplicationOftwoNumbers() {
		System.out.println("The MultiplicationOftwoNumbers Method");
	}
}

public class ManyToOneInheritance2 {

	public static void main(String[] args) {
		// Crating an object to access the class
		Multiplication a = new Multiplication();
		a.MultiplicationOftwoNumbers();
		a.types();
		
		

	}

}
