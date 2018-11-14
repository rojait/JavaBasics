package Inheritance;

public class TestAnimal {
	public static void main(String[] args) 
	{
		Animal a = new Animal("A scary animal");
		System.out.println(a.getAnimal());
		a.move();

		Animal an = new Dog("dog", "name", "breed");
		// Dog an=new Dog("dog","name","breed");
		an.move();

		Dog and = new Dog("dog", "name", "breed");
		// Dog an=new Dog("dog","name","breed");
		and.bark();
		// System.out.println(an.getDog());

	}

}

/*
 * output:-
A scary animal
Animals can move
Dogs can move
Dogs can bark
 */
