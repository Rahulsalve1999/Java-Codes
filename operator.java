public class operator{

	public static void main(String[] args){
	
	int a=10,b=20;
	System.out.println(a==b);    // 10==20
	System.out.println(a!=b);    // 10!=20
	System.out.println(a>b);     // 10>20
	System.out.println(a<b);     // 10<20
	System.out.println(a<=b);    // 10<=20
	System.out.println(a>=b);    // 10>=20
	System.out.println();

//---------------------Logical operator------------------//

	System.out.println(a==b && a!=b);   //10==20
	System.out.println(a==b || a!=b);   // 10==20 || 10!=20
	System.out.println(!(a>b));         // 10>20 =====> false
	System.out.println();

//-----------------increment decrement--------------//

	int c=10;
	System.out.println(c--);  //10 ---->9
	System.out.println(--c);  //8
	System.out.println(c++);  //8  ----->9
	System.out.println(++c);  //10 ----->10
  }
	
}