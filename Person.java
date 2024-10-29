// class is common properties or behaviaours of combination
// class is a group of elements having common properties and behaviaours
// class is virtual part. class had not created any type of memory, class is logicaly present

public class Person {
	
	int age=20;
	int weight=49;
	String color="Light";
	
	void eat()
	{
		System.out.println("I am Eating");
	}
	void sleep()	
	{
		System.out.println("I am Sleeping");
	}
	void run()
	{
		System.out.println("I am Rsunning");
	}

     public static void main(String[] args) {
	
	Person p=new Person();
	System.out.println(p.age);
	System.out.println(p.weight);
	System.out.println(p.color);

	p.eat();
	p.sleep();
	p.run(); 
     }
}