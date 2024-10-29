/*
polymorphism:-
		One thik Many forms means same object having different behaviour.
		
		There are two types of polymorphism
		1.Compile time polymorphism (static or early binding polymorphism)
			compile time polymorphism achieve through Method overloading
		2.Runtime polymorphism (Dynamic or late binding polymorphism)
              
                      Compile time Polymorphism  

             Compile time polymorphism achieve through Method overloading
	     Whenever a class contain more than one method with same name and different types of parameters called Method Overloading.



 class MethodOverloding 
{
	void add()
	{
		int a=20,b=30,c;
		c=a+b;
		System.out.println(c);
	}
	
	void add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(c);
	}
	
	void add(int x,double y )
	{
		double c;
		c=x+y;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		MethodOverloding obj=new MethodOverloding();
		obj.add();
		obj.add(50,50);
		obj.add(20,25.50); 
	}
}

class Test {

	void show()
	{
		System.out.println(1);
	}
	void show(int a)
	{
		System.out.println(2);
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		// t.show();
		t.show(10);
	}
}


	Runtime Polymorphism:
			 Runtime polymorphism achieve through Method overriading.
			 Whenever a two class contain more than one method with same name and same parameters called Method Overloading.
*/
class Test {

	void show()
	{
		System.out.println(1);
	}
}
class xyz extends Test {

	void show()
	{
		super.show();
		System.out.println(2);
	}
	
	public static void main(String[] args) {
	//	Test t=new Test();
	//	t.show();
		xyz t2 =new xyz();
		t2.show();
	}
}

