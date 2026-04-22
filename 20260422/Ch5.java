//Scanner
import  java.util.Scanner ;
public class Ch5 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.println("請輸入您要運算的數字-1") ;
		int X = A.nextInt() ;
		System.out.println("請輸入您要運算的數字-2") ;
		int Y = A.nextInt() ;
		int ans1 = X + Y ;
		int ans2 = X - Y ;
		int ans3 = X * Y ;
		float ans4 = (float) X /  Y ; 
		System.out.println("兩數相加為：" +  ans1 ) ;
		System.out.println("兩數相減為：" +  ans2 ) ;
		System.out.println("兩數相乘為：" +  ans3 ) ;
		System.out.println("兩數相除為：" +  ans4 ) ;
	}
}
