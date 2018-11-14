package Inheritance;

public class Dog extends Animal {
	
	// dog is inheriting all from animal class
	private String name;
	private String breed;

	public Dog(String atype, String aName, String aBreed)
	// Passing three arguments in a constructor
	{
		super(atype);
		name = aName;
		breed = aBreed;
	}

	public String getDog()
	{
		return super.getAnimal() + "  " + name + " " + breed;
	}

	public void move()
	{
		System.out.println("Dogs can move");
	}

	public void bark()
	{
		System.out.println("Dogs can bark");
	}
}
