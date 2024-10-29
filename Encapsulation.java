/*Encapsulation:-
		Encapsulation is a mechanism throgh which we can binding the data members and member methods in a single unut.
		Every java class is an example of encapsulation. 
		Encapsulation used for security perpose.
ex->
*/
import java.util.Scanner;
	
class Bank
{
		private double bal = 10000;
		private int pwd;
		double money;
		public void Deposite()
		{
			System.out.println("Enter password :");
			Scanner s = new Scanner(System.in);
			pwd=s.nextInt();
			System.out.println("Enter Your Deposite :");
			money = s.nextDouble();
		   if(pwd == 8007)
		   {
			  bal = bal + money;
			  System.out.println("Deposite money :" +money);
			  System.out.println("Total Balence :" +bal);
			  System.out.println("Your Transaction Successfull");
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
			  System.out.println("Your Transaction Successfull");
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
 class Custemer {

	public static void main(String[] args) {
	 
		Bank obg = new Bank();
		
		int choise;
		System.out.println("1.Deposite :");
		System.out.println("2.Withdrow :");
		System.out.println("3.Cheackbal :");

		Scanner s = new Scanner(System.in);
		choise = s.nextInt();
		
		switch(choise)
		{
		case 1:
			 obg.Deposite();
			 break;   
		case 2:
			 obg.Withdrow();
			 break;
		case 3:
			 obg.Cheackbal();
			 break;
	        default :
	    	       System.out.println("Sorry Incorrect Password.....");

		}	
	}
}

