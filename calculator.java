import java.util.Scanner;
public class calculator {
	
	public static void main(String[] args){
	 int a,b,c,ch;
	System.out.println("Enter any two number");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("Enter Your Choise");
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multification");
	System.out.println("4.Division");
	System.out.println("5.Remender");
	ch=sc.nextInt();

	switch(ch)
	{
	     case 1: c=a+b;
	     	     System.out.println("Addition = "+c);
		     break;	
	     case 2: c=a-b;
		     System.out.println("Subtraction = "+c);
	             break; 		 
	     case 3: c=a*b;
		     System.out.println("Multipication = "+c);
		     break;
	     case 4: c=a/b;
	             System.out.println("Division = "+c);
		     break;	
	     case 5: c=a%b;
                     System.out.println("Remender = "+c);
		     break;	
	     case 6: 
		     System.out.println("Invalid choise");									 			
	}	
   }
}