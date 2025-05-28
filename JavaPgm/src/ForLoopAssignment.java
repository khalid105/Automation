
public class ForLoopAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Assignmnet - Print Even and odd number in rverse order 
				//Print reverse string "Automation"
		
		String originalStr = "Automation";
		String reversedStr = "";

		for (int i = 0; i < originalStr.length(); i++) {
		  reversedStr = originalStr.charAt(i) + reversedStr;
		}

		System.out.println("Reversed string: "+ reversedStr);
		
		//=====Reverse String Example2
		
		String originalStr2 = "Hello";
		String reversedStr2 = "";

		for (int i = 0; i < originalStr2.length(); i++) {
		  reversedStr2 = originalStr2.charAt(i) + reversedStr2;
		}

		System.out.println("Reversed string: "+ reversedStr2);
		

	}
	
	
}
