package oops;

class Animal{
	public void display()
	{
		System.out.println("Animal Kingdom");
	}
}

class Mammal extends Animal{
	public void birth()
	{
		System.out.println("Mammals give birth to offsprings.");
	}
}

class Dog extends Mammal{
	public void puppy()
	{
		System.out.println("Dog's offspprings are called Puppy");
	}
}
public class Multilevel_inheritance_demo {

	public static void main(String[] args) {
		Dog dg=new Dog();
		dg.puppy();
		dg.birth();
		dg.display();
	}

}
