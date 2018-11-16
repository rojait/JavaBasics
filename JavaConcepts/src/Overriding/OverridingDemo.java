package Overriding;

public class OverridingDemo {

	public static void main(String[] args){

		Car_1 car = new Car_1();
		Car_1 ford = new Ford_2();
		Car_1 bmw1 = new BMW_3();
		Car_1 bmw2 = new Car_1();

		car.move();
		ford.move();
		bmw1.move();
		bmw2.move();

	}
}
/*
The car can be Ford or BMW
This is Ford car
This is BMW car
The car can be Ford or BMW
*/