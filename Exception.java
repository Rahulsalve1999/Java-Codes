/* 
Exception:-
	An exception is unexpected/unwanted/abnormal situation that occured at runtime called exception.

Exception Handling:-
		In exception handling we shoud hava an alternate source through which we can handle the exception.
*/
class Test {

	void show()
	{
		int a=10,b=0,c;
		try {
		   c=a/b;	
		   System.out.println(c);
		}
		catch(Exception e)
		{
		 //  System.out.println(e);
		   System.out.println("can not devide by zero");		
		}
	}
     public static void main(String[] args) {
        System.out.println("main method started");
	Test t=new Test();
	t.show();
	System.out.println("main method ended");
     }
}