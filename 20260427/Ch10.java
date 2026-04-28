public class Ch10 {
	public static void main (String [] args) {
		for (int A = 0 ; A <= 100 ; A+=10 ) {
			for (int B = 150 ; B >= 0 ; B -= 10) {
				for (int C = 0 ; C <= 20 ; C++) {
					System.out.println( "A = " + A ) ;
					System.out.println( "B = " + B ) ;
					System.out.println( "C = " + C ) ;
					System.out.println( "總和是" + (A+B+C)) ;
					System.out.println( "=======================================") ;
				}
			}
		}
	}
}
