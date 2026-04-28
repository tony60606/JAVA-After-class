// while 迴圈： 
// while  條件判斷 ;
// 		執行程式碼
//			賦值  => 應避免進入死迴圈，需賦值讓條件判斷成false跳出迴圈
public class Ch9 {
	public static void main (String [] args) {
		int i = 0 ;
		while (i <= 10) {
			System.out.print(i + " ") ;
			i++ ;
		}
		int j = 0 ;
		System.out.print( "\n") ;
		while (j <= 100) {
			System.out.print( j + " ") ;
			j += 10 ;
		}
	}
}
