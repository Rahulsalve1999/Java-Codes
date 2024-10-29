import java.util.Arrays;
import java.util.Scanner;
public class Array {

    public static void main(String[] args) {

        //  int a[]={10,20,30,40,50};
	//  for(int b:a)
	// {
	//  	System.out.print(b+" ");
        //  }

	int a[]=new int[5];
	System.out.println("Enter Array Elements :");
	Scanner sc=new Scanner(System.in);
	for(int i=0; i<5; i++)
	{
	  	a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	System.out.println("Array Elements :");
	for(int b:a)
	{
		System.out.print(b+" ");
	}
    } 
}