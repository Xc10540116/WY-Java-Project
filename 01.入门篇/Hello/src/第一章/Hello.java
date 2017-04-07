package 第一章;

import java.util.Scanner;


public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("你好");
//		Scanner in = new Scanner(System.in);
//		int amount = 100;
//		int price = 0;
//		System.out.print("请输入票面：");
//		amount = in.nextInt();
//		System.out.print("请输入金额：");
//		price = in.nextInt();
//		System.out.println(amount + " - " + price + " = " + (100 - price));
//		in.close();
		int foot;
		double inch;
		Scanner in = new Scanner(System.in);
		System.out.print("");
		foot = in.nextInt();
		inch = in.nextDouble();
		int meter = (int)((foot + inch/12)*0.3048*100);
		System.out.println("meter = " + meter);
		in.close();
	}

}
