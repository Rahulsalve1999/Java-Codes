/* Constructor is a special type of method whose name is same as class name.
// The main purpose of Constructor is initialize the value in variale/object.
// Every java class has a constructor
// A Constructor is automatically called at the time of object creation.
// A Contructor never contain any return-type including void.

 class A {

	int a;
	String name;
	
	A()
	{
		a=100;
		name="Rahul";
	} 
	void show()
	{
	 	System.out.println(a+" "+name);
	}	
}

class B {

	public static void main(String[] args) {
	
		A ref=new A();
		ref.show();		
	}
}


 Types of constructor:-
			1.default constructor 
                	2.parametrized constructor
			3.copy constructor
			4.private constructor 

      default constructor:-
			default constructor does not have any parameters is called default constructor.

      parametrize constructor:-
			A constructor through which we can pass one or more parameters is called parametrized constructor.	


class A {
	int x,y;
	A(int a, int b)
	{ 
		x=a;
		y=b;
	}
	void show()
	{ 
		System.out.println(x+" "+y);
	}
}
class B {
	public static void main(String[] args) {
		A ref=new A(100,300);
		ref.show();
	}

}


copy constructor:-
		Whenever we pass object reference to the constructor then it is called copy constructor.
		one object containt copy to the another object by the helg of refernce object.

class A {
	int a;
	String name;
	A()
	{
		a=200;
		name="Rahul";
		System.out.println(a+" "+name);
	}
	A(A ref)
	{
		a=ref.a;
		name=ref.name;
		System.out.println(a+" "+name);
	}
}
class B {
	public static void main(String[] args) {
		A obj=new A();
		A obj1=new A(obj);
        }
}
*/

class A {
	int a;
	String name;
	A(int a, String name)
	{
		System.out.println(a+" "+name);
	}
	A(A ref)
	{
		a=ref.a;
		name=ref.name;
		System.out.println(a+" "+name);
	}
}
class B {
	public static void main(String[] args) {
		A obj=new A(100,"Salve");
		A obj1=new A(obj);
        }
}

