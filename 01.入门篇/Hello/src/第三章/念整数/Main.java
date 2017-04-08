package 第三章.念整数;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int len = Integer.toString(number).length();
		String result = "";
		if(number < 0){
			result = "fu ";
			len = len - 1;
			number = Math.abs(number);
//			System.out.println(number);
		}
		for(int i=0; i<len; i++) {
			int a = (int)Math.pow(10.0, (double)(len-i-1));
			int n = number / a;
			number = number % a;
//			System.out.println("a:" + a);
//			System.out.println("n:" + n);
//			System.out.println("number:" + number);
			switch(n){
				case 0:
					result = result + "ling";
					break;
				case 1:
					result = result + "yi";
					break;
				case 2:
					result = result + "er";
					break;
				case 3:
					result = result + "san";
					break;
				case 4:
					result = result + "si";
					break;
				case 5:
					result = result + "wu";
					break;
				case 6:
					result = result + "liu";
					break;
				case 7:
					result = result + "qi";
					break;
				case 8:
					result = result + "ba";
					break;
				case 9:
					result = result + "jiu";
					break;
			}
			if(i != len-1)
				result = result + " ";
		}
		System.out.println(result);
		in.close();
	}

}
