/* Interface:-
		1.it is used to achieve abstraction
		2.it supports multiple inhertance
		3.Interface just like a class, which contains only abstract method.
		4.To achieve interface in java by the helf of implements keyword.
		5.Bydefault variable are public static final within interface.
		6.Bydefault method public and abstract.
		7.we can declere default method and static method in interface.

interface I1 {

	int a=10;       // public+static+final
	void show();    // public+abstract
}
class Test {
	void show()
	{
		System.out.println("I am show method within interface");
	}
	public static void main(String[] args) {
		
	//	I1 i=new I1();
		Test t=new Test();
		t.show();
	}
}

 Multiple Inhertance support in java (two class property inherit the one class.)  
*/
interface I1 {
	
	void show();
}
interface I2 {
	void display();
}
class Test implements I1, I2 {
	public void show()
	{
		System.out.println("I am show method within interface");
	}
	public void display()
	 {
			System.out.println("I am display method within interface");
	 }
	
	public static void main(String[] args) {
		
	//	I1 i=new I1();
		Test t=new Test();
		t.show();
		t.display();
	}
}

