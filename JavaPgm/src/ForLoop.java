
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1-10
		
		/**
		 * int i =1 --- Initalization
		 * 
		 * i<=10 -- condition -- if condition is true - loop will continue else it will break
		 * 
		 * i++ -- increment - it will increase 1  --- i++ = i = i+1  i= i+2
		 */
		
		for(int i = 1 ; i<=10 ; i++) // 11  11<=10  11
		{
			System.out.println(i);
		}
		//==================================
		//Odd Number - 1 3 5 7 9 11 13 
		
		for(int i = 2 ; i<=20 ; i= i+2)
		{
			System.out.println(i);
		}
		//============================
		
		// even number - 2 4 6 8 10
		   //       0123456
		String s = "Testinggdfhdgsfgsdfgdfdsgfj";
		
		System.out.println(s.length());
		
		for(int i = 0 ; i<s.length() ; i++)  // 1 1<=6  1
		{
			System.out.println(s.charAt(i));  // "Testing"charat(1)
		}
		//=============================
		//Reverse order
		
		//10 9  8 7 
		
		for(int i = s.length()-1  ; i>=0 ; i--)
		{
			System.out.println(s.charAt(i));
		}
		
		
		for(int i = 10  ; i>=1 ; i--)  // 9 9>=1  9
		{
			System.out.println(i);
		}
		
		//Assignmnet - Print Even and odd number in rverse order 
		//Print reverse string "Automation"

	}

}
