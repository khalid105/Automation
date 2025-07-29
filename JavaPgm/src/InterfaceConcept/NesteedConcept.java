package InterfaceConcept;

class Abc
{
	public void Test7()
	{
		System.out.println("calling Test7");
	}
	
	static  class BCD
	{
		public void Test1()
		{
			System.out.println("calling Test1");
		}
	}
}

class CDE
{
	
	public void Test5()
	{
		System.out.println("Calling Test5");
	}
		interface DEF
		{
		public void Test2();
		
		}
}

class Multifile extends CDE implements CDE.DEF
{

	@Override
	public void Test2() {
		// TODO Auto-generated method stub
		System.out.println("Implement  Test2");
	}
	
}


interface EFG
{
	public void Test6();
	class FGH
	{
		public void Test3()
		{
			System.out.println("calling Test3");
		}
	}
}

//class Multi extends EFG.FGH
//{
//	
//}

interface GHI
{
	interface HIJ
	{
		public void Test4();
	}
}

class MultiInter implements GHI.HIJ
{

	@Override
	public void Test4() {
		// TODO Auto-generated method stub
		System.out.println("Implemet Test4");
	}
	
}

public class NesteedConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CDE c = new CDE();
		
		c.Test5();
		
		Multifile f = new Multifile();
		f.Test2();
		f.Test5();
		
		MultiInter m = new MultiInter();
		m.Test4();
		
		EFG.FGH ef = new EFG.FGH();
		ef.Test3();
		
		Abc a  = new Abc();
		a.Test7();
		
	//	Abc.BCD b = a.new BCD();
		
		Abc.BCD b1 = new Abc.BCD();
		b1.Test1();

	}

}
