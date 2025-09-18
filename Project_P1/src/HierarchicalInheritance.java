class Animal
{
	void eat()
	{
		System.out.println("This is animal eats food");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("The dog barks..");
	}
}
class Cat extends Animal
{
	void meow()
	{
		System.out.println("The cat meow");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
	
		Dog d=new Dog();
		d.eat();
		d.bark();
		
		Cat c=new Cat();
		c.eat();
		c.meow();

	}

}
