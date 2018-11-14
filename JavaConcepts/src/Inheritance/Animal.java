package Inheritance;

public class Animal {
	
	// Creating a private string variable 
	private String type; 

	public Animal(String atype)
	{
		type = atype;
		// System.out.println("Value of type in side " + type);
	}

	public String getAnimal()
	{
		return type;
	}

	public void move()
	{
		System.out.println("Animals can move");
	}
}
