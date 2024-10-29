/* Abstraction:-
		Abstraction is nothing but hiding the essential information and highligh the only set of services.
*/

import java.util.Scanner;

abstract class Bank
{
	String name = "Bank of Maharashtra";
	String IFSC = "MHB17G0007";
	void bankDetails()
	{
		System.out.println("Bank Name: "+name);
		System.out.println("IFSC Code: "+IFSC);
	}
	abstract void Deposite();
	abstract void Withdrow();
	abstract void Cheackbal();
}

class BankService extends Bank
{
	private double bal = 10000;
	private int pwd;
	double money;
	
	public void Deposite()
	{
		System.out.println("Enter password :");
		Scanner s = new Scanner(System.in);
		pwd=s.nextInt();
		System.out.println("Enter Your Deposte :");
		money = s.nextDouble();
	   if(pwd == 8007)
	   {
		  bal = bal + money;
		  System.out.println("Deposite money :" +money);
		  System.out.println("Total Balence :" +bal);
	   }
	   else
	   {
		  System.out.println("Incorrect password.....");
	   }
    }
	
	public void Withdrow()
	{
		System.out.println("Enter password :");
		Scanner s = new Scanner(System.in);
		pwd=s.nextInt();
		System.out.println("Enter Your Withdrow money:");
		money = s.nextDouble();

	    if(pwd == 8007)
	    {
		 
		bal = bal - money;
		  System.out.println("Withdrow money :" +money);
		  System.out.println("Total Balence :" +bal);
	    }
	   else
	   {
		  System.out.println("Incorrect password.....");
	   }
	}
	
	public void Cheackbal()
	{
		System.out.println("Enter password :");
		Scanner s = new Scanner(System.in);
		pwd=s.nextInt();
	
	    if(pwd == 8007)
	    {
		   System.out.println("Total Balence :" +bal);
	    }
	   else
	   {
		  System.out.println("Incorrect password....");
	   }
	}
}
 class customer {

	public static void main(String[] args) {
	//	Bank d = new Bank();
		BankService b = new BankService();
		b.bankDetails();
		int choise;
		System.out.println("1.Deposite :");
		System.out.println("2.Withdrow :");
		System.out.println("3.Cheackbal :");

		Scanner s = new Scanner(System.in);
		choise = s.nextInt();
		
		switch(choise)
		{
		case 1:
			    b.Deposite();
			    
	    break;
		case 2:
			    b.Withdrow();
		break;
		case 3:
			    b.Cheackbal();
		break;
	    default :
	    	System.out.println("Sorry Incorrect Password.....");
		}	
	}
}
