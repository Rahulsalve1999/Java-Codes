abstract class A {

	A(int a)
	{
		System.out.println(a);
			
	}
}

class B extends A
{
	int b,c;
	B(int a, int b, int c) 
	{
		super(a);
		this.b=b;
		this.c=c;
		
	}
}
 class C
 {
	 public static void main(String[] args) {
		
		 B b = new B(10,20,30);
		System.out.println(b);
	}
 }