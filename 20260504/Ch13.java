import java.util.Scanner ;
public class Ch13 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.println("請輸入四位數密碼：") ;
		int num = A.nextInt() ;
		int psw = 1342 ;
		int time = 1 ;
		while (num != psw) {
			if (time < 3) {
				System.out.println("密碼錯誤，請重新輸入：") ;
				num = A.nextInt() ;
				time ++ ;
			} else { 
				System.out.println("已鎖定，請一小時後重試") ;
				return ;
			}
		}
		System.out.println("密碼正確") ;
	}
}
