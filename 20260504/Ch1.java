//雙層for迴圈
public class Ch1 {
	public static void main (String [] args) {
		for (int i = 1 ; i <= 9 ; i++) {
			for (int j = 1 ; j <= 9  ; j++) {
				System.out.print("i = " + i + " ; ") ;
				System.out.print("j = " + j + " ; " ) ;
				System.out.println("i * j =" + i*j) ;
				System.out.println("==============") ;
			}
		}
	}
}
