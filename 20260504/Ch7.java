// 輸入數是否為偶數
import java.util.Scanner ;
public class Ch7 {
	public static void main (String [] args) {
		Scanner A =new Scanner(System.in) ;
		while (true) {
			System.out.println("請輸入任一數字：") ;
			int i = A.nextInt() ;
			if  (i == 0) {
				break ;
			}
			if (i%2 == 0) {
				System.out.println("此數為偶數") ;
			} else {
				System.out.println("此數為奇數") ;
			}
		}
	}
}
