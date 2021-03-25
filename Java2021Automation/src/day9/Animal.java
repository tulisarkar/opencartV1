package day9;

public class Animal {
	String color="white";
	void eat()
	{
		System.out.println("eating...");
	}
	Animal()
	{
		System.out.println("Aninam is created");
	}
	

}
class dog extends Animal
{
	String color="black";
	void displayColor()
	{
		System.out.println(color);
	System.out.println(super.color);
	}
	
	dog()
	{
		super();
		System.out.println("Dog is created");
	}
	void eat()
	{
		System.out.println("eating bread...");
	super.eat();
	}
}