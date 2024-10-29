/* abstract class:-
		1.It a class contain at least one abstract method called abstract class.
		2.We can not creat object for abstract class.
		3.It contains both abstract & non-abstract methods.
		4.Whenever the action is common but implementations are different than we should use abstraction method.
*/


abstract class Animal
{
    void legs()
    {
	    System.out.println("All animals have 4 legs");
    }
   abstract void sound();
   abstract void eat();
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("bho  bhoooo....");
	}
	void eat()
	{
		System.out.println("Bhisket.....");
	}
}

class Cow extends Animal
{
	void sound()
	{
		System.out.println("hamba hamba.....");
	}
	void eat()
	{
		System.out.println("Grass eating...");
	}
}

 class abstractionClass {

	public static void main(String[] args) {

		Dog d = new Dog();
		Cow c = new Cow();
		d.sound();
		d.eat();
		d.legs();
		c.sound();
		c.eat();
		c.legs();
	}

}
