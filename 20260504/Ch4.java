//continue
public class Ch4 {
	public static void main (String [] args) {
		for (int i  = 0 ; i  <= 15 ; i++) {
			if (i == 3 ||  i == 11 || i == 7 || i == 14 || i == 6) {
				continue ;
			}
			if ( i == 15 ) {
				System.out.print(i ) ;
			} else {
				System.out.print(i + "、") ;
			}
		}
	}
}
 
