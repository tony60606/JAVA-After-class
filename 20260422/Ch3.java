//遞增、遞減
public class Ch3 {
	public static void main (String [] args) {
		int A = 0 ;
		int B = 0 ;
		A++ ;
		System.out.println(A) ;
		++B ;
		System.out.println(B) ;
		A += B ;
		B -= A ;
		System.out.println(A) ;
		System.out.println(B) ;
		System.out.println(A++) ;
		System.out.println(A+(B++)) ;
		System.out.println((++B)+A) ;
	}
}
