 
/*super keword:-
	     1.super keyword refers to the objects of super class, it is used when we want to call the super class variable, method & constructor by sub class object.
	     2.Whenever the super class & sub class variable and method name both are same than than it can be used only.
 	     3.To avoid the confusion between super class and sub class variables and methods that have same name we should use super keyword.	

        ------> super class variable call by super keword
class A {
	int a=10;
}  	
class B extends A {
	int a=20;
	void show()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
}
class Test {
	public static void main(String[] args) {
		B ref=new B();
		ref.show();
	}
}

    ------> super class Method call by super keword
class A {
	void show()
	{
		System.out.println("Hiii Rahul");
	}
}  	
class B extends A {
	void show()
	{
		super.show();
		System.out.println("Hiii Juss");
	}
}
class Test {
	public static void main(String[] args) {
		B ref=new B();
		ref.show();
	}
}

     ------> default constructor call by super keword
class A {
	A()
	{
		System.out.println("Hiii Rahul");
	}
}  	
class B extends A {
	B()
	{
		super();
		System.out.println("Hiii Juss");
	}
}
class Test {
	public static void main(String[] args) {
		B ref=new B();
	}
}

    ------> Parameterize constructor call by super keword
class A {
	A(int a)
	{
		System.out.println(a);
	}
}  	
class B extends A {
	B(int a)
	{
		super(100);
		System.out.println(a);
	}
}
class Test {
	public static void main(String[] args) {
		B ref=new B(200);
	}
}
*/