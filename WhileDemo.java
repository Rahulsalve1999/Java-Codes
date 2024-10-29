
import java.util.Scanner;

public class WhileDemo {
		
	void show()
	{
		int num;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num>0)
		{
			if(num%2==0)
				System.out.println("Even Number");
			else
				System.out.println("Odd Number");
		}
	}

	public static void main(String[] args) {

		WhileDemo obj =new WhileDemo();
		obj.show();
	}
}
