// 輸入數是否為偶數
import java.util.Scanner ;
public class Ch6 {
	public static void main (String [] args) {
		Scanner A =new Scanner(System.in) ;
		System.out.println("請輸入任一數字：") ;
		int i = A.nextInt() ;
		for (;;) {
			if (i == 0) {
				break ;
			}
			if ( i%2 == 0) {
				System.out.println("此數為偶數") ;
				System.out.println("請輸入任一數字：") ;
				i = A.nextInt() ;
			} else {
				System.out.println("此數為奇數") ;
				System.out.println("請輸入任一數字：") ;
				i = A.nextInt() ;
			}
		}
	}
}
