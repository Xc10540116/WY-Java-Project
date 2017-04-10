package 第1章.单词长度;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s;
		int len;
		boolean isEnd = false;
		do {
			s = scanner.next();
			len = s.length();
			if(s.substring(len-1).equals(".")){
				System.out.print(len-1);
				isEnd = true;
			} else {
				System.out.print(len + " ");
			}
		}while(!isEnd);
		scanner.close();
	}

}
