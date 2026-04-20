// final宣告
public class Ch4 {
	public static void main (String [] args) {
		final int small = 30 ;
		final int big = 45 ;
		int black = 5 ;
		int green = 3 ; 
		// int small = 40 ;
		int smallblack = small * black ;
		int biggreen = big * green ;
		int total = smallblack + biggreen ;
		System.out.println("小杯紅茶金額：" + smallblack + "大杯綠茶金額：" + biggreen + "總金額" + total ) ;
	}
}
		
