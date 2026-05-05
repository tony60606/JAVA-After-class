//雙層while迴圈
public class Ch2 {
	public static void main (String [] args) {
		int i = 1 ;
		while ( i <= 9 ) {
			int j = 1 ;
			while ( j <= 9 ) {
				System.out.println("i = " + i  + " ; ") ;
				System.out.println("j = " + j ) ;
				System.out.println("==============") ;
				System.out.println(" i * j = " + i*j ) ;
				System.out.println("==============") ;
				j++ ;
			}
			i++ ;
		}
	}
}
