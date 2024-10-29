/* Instance vs static block

 Instance block
1. it deals with object.                         
2.it do not execute without object.
3.no any keyword required
4.static and non-static variable can be accessed within the instance block

 static block
1.it deals with class.
2.executed at the time of loaded .class file in JVM.
3.static keyword is required.
4.only static variable can be accessed inside the static block

public class instanceBlock {

	instanceBlock()
	{
		System.out.println("default constructor");
	}

	{
		System.out.println("Hii Rahul");
	}

	public static void main(String[] args) {

		instanceBlock i=new instanceBlock();
	}
}
*/
public class staticBlock {
	
	int a=20;
	static int b=30;
	static{
		System.out.println("Hii Rahul");
	     //	System.out.println(a+" "+b);
		System.out.println(b);
	}

	public static void main(String[] args) {

	}
}
