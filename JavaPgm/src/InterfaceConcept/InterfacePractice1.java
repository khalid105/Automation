package InterfaceConcept;

interface Shape2
{
	public void Trinagle();//In Interface the Abstract keyword is not require 
}

interface Square2 extends Shape2
{
	public void SquareShape();
}

interface Penta2 extends Square2
{
	public void Pentagon();
	
}
interface Hexa2
{
	public void Hexagon();
}

interface Septa2 extends Penta2,Hexa2
{
	public void Septagon();
}
class Multimedia2 implements Septa2 //Penta2,Hexa2 //Class can implements multiple interfaces
{

	@Override
	public void Trinagle() {
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

public class InterfacePractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multimedia2 m =new Multimedia2();
		m.Trinagle();
		m.SquareShape();
		m.Pentagon();
		m.Hexagon();
		m.Septagon();

	}

}
