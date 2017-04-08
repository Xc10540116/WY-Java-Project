package 第三章.数字特征值;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int len = Integer.toString(a).length();
		int result = 0;
//		System.out.println(len);
		for(int i=0; i<len; i++) {
			int b = a % 10;
			a = a / 10;
//			System.out.println(b);
			if(NumberType(b) == NumberType(i+1))
				result = result + (int)Math.pow(2.0,(double) i);
		}
		System.out.println(result);
		in.close();
	}

	public static Integer NumberType(int number){
		if(number % 2 == 0)
			return 1;
		else
			return 0;
	}
}
