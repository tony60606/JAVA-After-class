// 輸出 1~ n 的數字
import java.util.Scanner ;
public class Ch5 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.println("請輸入任一數字：") ;
		int i = A.nextInt() ;
		for (int j = 1 ; j <=i ; j++) {
			if (j != i) {
				System.out.print(j + "、") ;
			} else {
				System.out.print(j) ;
			}
		}
	}
}
		
