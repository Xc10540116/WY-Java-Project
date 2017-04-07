package 第三章.奇偶个数;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int j = 0;
		int o = 0;
		while(a >= 0) {
			if(a%2 == 0)
				o++;
			else
				j++;
			a = in.nextInt();
		}
		System.out.println(j + " " + o);
	}

}
