import java.util.Scanner ;
public class Ch10 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.println("請輸入西元年：") ;
		int year = A.nextInt() ;
		int nyear = year - 1911 ;
		if ( year >= 1911 ) {
			System.out.printf("西元%d年就是民國%d年",year,nyear) ;
		} else {
			System.out.println("輸入錯誤") ;
		}
	}
}
