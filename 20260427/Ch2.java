import java.util.Scanner ;
public class Ch2 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.print("請輸入年齡：");
		int age = A.nextInt() ; 
		if (age >= 18) {
			System.out.print("可以考取駕照");
		}
	}
}
