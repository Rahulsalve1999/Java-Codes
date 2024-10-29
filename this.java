/*this keyword:-
		1.this keyword refers to the currunt object inside a method or constructor.(this keyword write in method or constructor)
		2.Whenever the name of instance and local variables both are same then our runtime environment JVM gets connfused that which one is local variable and which one is instance variable, to avoid the problem we should use this keyword.
		3.It is also used when we want to call the default constructor of its own class.(tyach class cha default constructor means same class)
		4.It is also called parametrized constructor of its own class.

class A {
	void show()
        {
		System.out.println(this);
	}
	public static void main(String[] args) {
		A ref=new A();
		System.out.println(ref);
		ref.show();
        }
}


class A {
	int a;
	A(int a)
	{
		this.a=a;
		System.out.println(a);
	
	}
	void show()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		A ref=new A(200);
		ref.show();
	}
}

--------------- call the default constuctor by this keyword ------------
class A {
	A()
	{
		System.out.println("Hiii Rahul");
	}
	A(int a)
	{
		this();
		System.out.println(a);
	}
	public static void main(String[] args) {
		A ref=new A(800);
	}
}
*/

class A {
	A()
	{
		this(200);
	}
	A(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		A ref=new A();
	}
}