import java.util.Scanner ;
public class Ch7 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.println("請輸入您的年紀：") ;
		int age = A.nextInt() ;
		String msg1 = " " ;
		if (age >= 20 ) {
			msg1 = "已成年" ;
		} else {
			msg1 = "未成年" ;
		}
		System.out.println(msg1) ;
		String msg2 = age >= 25 ? "大學畢業" : "大學未畢業" ;
		System.out.println(msg2) ;
	}
}
