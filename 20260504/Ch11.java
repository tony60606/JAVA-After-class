import java.util.Scanner ;
public class Ch11 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.println("請輸入使用者名稱：") ;
		String name  = A.next() ;
		System.out.printf("歡迎您，使用者：%s",name) ;
	}
}
