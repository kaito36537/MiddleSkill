package test;
 public class test1 {
	public static void main(String[] args) {
		
//		1.数字の5と9の変数を定義し、足した数字を出力しなさい。
		int data = 5;
		int data1= 9;
		System.out.println(data+data1);
		
//		2.64ビット整数の「1111111111」を定義し2倍した値を出力しなさい。
		long bit= 1111111111;
		long doubleBit=bit*2;
		System.out.println(doubleBit);

//		3.boolean型の変数の値に不正な文字列比較を入れてfalseを出力してください
		boolean k;
		if("japanese".equals("111")) {
			k = true;
		}else {
			k = false;
		}
		System.out.println(k);

	}
}
