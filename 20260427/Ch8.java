// for迴圈： for (宣告變數;條件判斷;賦值)
import java.util.Scanner ;
public class Ch8 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.println("請輸入一個數字：") ;
		for (int i = A.nextInt() ; i <= 100 ; i+=15 )  {
			System.out.println(i) ;
		}
		System.out.println("請輸入另一個數字：") ;
		for (int j = A.nextInt() ; j <= 50 ; j++ )  {
			System.out.print(j+"、") ;
		}
	}
}
