//條件判斷、and、or、not
public class Ch4 {
	public static void main (String [] args) {
		int A = 50000 ;
		int B = 30000 ;
		int C = 70 ;
		char D = 'Z' ;
		char E = '許' ;
		char F = '柳' ;
        boolean ans1 = A > B ;
        System.out.println(A + ">" + B + ",ans：" + ans1) ;
        boolean ans2 = C < D ;
        System.out.println(C + "<" + D + ",ans：" + ans2) ;
        boolean ans3 = E >= F ;
        System.out.println(E + ">=" + F + ",ans：" + ans3) ;
        boolean ans4 = A <= F ;
        System.out.println(A + "<=" + F + ",ans：" + ans4) ;
        boolean ans5 = D == E ;
        System.out.println(D +  "==" + E + ",ans：" + ans5) ;
        boolean ans6 = A != C ;
        System.out.println(A + "!=" + C + ",ans：" + ans6) ;
        System.out.println(A >= B && D <= F) ;
        System.out.println(C < A || F > D) ;
        System.out.println(!ans5) ;
	}
}
