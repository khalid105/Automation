package polymorphism;

class Animal
{
	public void Voice()
	{
		System.out.println("ANimal Voice");
	}
}

class Tiger extends Animal
{
	public void Voice()
	{
		System.out.println("Roar");
	}
}

class Dog extends Animal
{
	public void Voice()
	{
		System.out.println("Bark");
	}
}

class Cat extends Animal
{
	public void Voice()
	{
		System.out.println("Meow");
	}
}

public class RTP {

	public static void main(String[] args) {
		//Upcasting - trying to create a object of parent class and call child Constructor
		
		Animal a = new Cat(); //upcasting
		a.Voice();
		
		//WebDriver driver = new ChromeDriver() //RTP

	}

}
