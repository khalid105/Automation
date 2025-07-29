package InterfaceConcept;

interface Shape
{
	 public void Tringle(); //abstract method
}

interface Square extends Shape
{
	public void SquareShape();
	
}

interface Penta extends Square
{
	public void Pentagon();
}

interface Hexa
{
	public void Hexagon();
}

interface Septa extends Penta ,Hexa
{
	public void Septagon();
}

class Multimedia implements Septa
{

	@Override
	public void Tringle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SquareShape() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Pentagon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Hexagon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Septagon() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceConc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multimedia m = new Multimedia();
		m.Tringle();
		
		

	}

}
