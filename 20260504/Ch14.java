import java.util.Scanner ;
public class Ch14 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.println("請輸入四位數密碼：") ;
		int num = A.nextInt() ;
		for (int i =1 ; i <= 3 ; i++) {
			if (num == 1234 ) {
				System.out.println("密碼正確") ;
				return ;
			} else {
				if ( i < 3 ) {
					System.out.println("密碼錯誤，請重新輸入：") ;
					num = A.nextInt() ;
				}  else {
					System.out.println("已鎖定，請一小時後重試") ;
					break ;
				}
			}
		}
	}
}
