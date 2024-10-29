/*
Inheritance:-
	     1.When one class access the property of another class its called inheritance.
	     2.Inheritance is parent child relationship
	     3.In java extends keyword is used to parform inheritance.
	     4.Inheritance are provides code reusability.
  	     5.A sub class contains all property of sub class so we can create object of sub class.
	     6.Method overriding only possible inheritance.
             7.we can not access private members of class.
Types of inheritance:-
		1.single inheritance:
				we have only on super class and one sub class.

class A {

	void show()
	{
		System.out.println("I am show method in class A");
	}
}	
class B extends A{

	void display()
	{
		System.out.println("I am display method in class B");
	}
	public static void main(String[] args) {
	
	B obj=new B();
	obj.display();
	obj.show();

	}
}	

	2.Mulilevel Inheritance:-
				We have only one super class and multiple sub classes called multiple inheritance.

class A {

	void showA()
	{
		System.out.println("I am showA method in class A");
	}
}	
class B extends A {

	void showB()
	{
		System.out.println("I am showB method in class B");
	}
}
class C extends B {

	void showC()
	{
		System.out.println("I am showC method in class C");
	}

	public static void main(String[] args) {
	
	C obj=new C();
	obj.showA();s
	obj.showB();
	obj.showC();
	}
}


//    Multiple inheritance:-
				java can not support multiple inheritanse because ambigies error created.


class A {

	void showA()
	{
		System.out.println("I am showA method in class A");
	}
}	
class B {

	void showB()
	{
		System.out.println("I am showB method in class B");
	}
}
class C extends A,B {

	void showC()
	{
		System.out.println("I am showC method in class C");
	}

	public static void main(String[] args) {
	
	C obj=new C();
	obj.showA();
	obj.showB();
	obj.showC();
	}
}

	//Interface:-
			We can achieve multiple inheritance through interface because interface contains only abstract method, 
                        which implementation is provided by the sub classes.

interface A {

	void showA();
}	
interface B {

	void showB();
}
class C implements A,B {

	public void showA()
	{
		System.out.println("I am showA method in interface A");
	}
	public void showB()
	{
		System.out.println("I am showB method in interface B");
	}
	void showC()
	{
		System.out.println("I am showC method in class C");
	}

	public static void main(String[] args) {
	
	C obj=new C();
	obj.showA();
	obj.showB();
	obj.showC();
	}
}
*/
 //   Hiearchical inheritance:-
//				We hava only one super class and multiple subclass But sub classes are directly connected (extends) to super class called hierarchical inhiritance.	

class A
{
	void input()
	{
		System.out.println("Enter Your Name");
	}
}
class B extends A
{
	void disp()
	{
		System.out.println("My Name Is disp method in class B");
	}
}
class C extends A
{
	void show()
	{
		System.out.println("My Name show method in class C");
	}

	public static void main(String[] args) {

		B obj = new B();
		obj.input();
		obj.disp();
		C obj1=new C();	
		obj1.input();
		obj1.show();
	}
}

