// Examples of even numbers are 2, 4, 6, 8, 10, 12, 14,…
// Examples of odd numbers are 3, 5, 7, 9, 11, 13, 15,… 
import java.util.Scanner;
public class Even{

public static void main(String[] args){

	int num;
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	
	if(num%2==0)
	System.out.println("Even number");
	else
	System.out.println("Odd Number");
}
}