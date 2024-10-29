
import java.util.Scanner;

class For
{
	int num;

	void show()
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();

		for(int i=1; i<=10; i++)
		System.out.println(num*i);
	}
   public static void main(String[] arg)
   {
	   For f=new For();
	   f.show();
   }		

}