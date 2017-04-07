package 第二章.信号报告;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int init = in.nextInt();
		int s = init % 10;
		int r = init / 10;
//		System.out.println(s);
//		System.out.println(r);
		String left = "";
		String right = "";
		switch(s){
			case 1:
				left = "Faint signals, barely perceptible";
				break;
			case 2:
				left = "Very weak signals";
				break;
			case 3:
				left = "Weak signals";
				break;
			case 4:
				left = "Fair signals";
				break;
			case 5:
				left = "Fairly good signals";
				break;
			case 6:
				left = "Good signals";
				break;
			case 7:
				left = "Moderately strong signals";
				break;
			case 8:
				left = "Strong signals";
				break;
			case 9:
				left = "Extremely strong signals";
				break;
		}
		switch(r) {
			case 1:
				right = "unreadable";
				break;
			case 2:
				right = "barely readable, occasional words distinguishable";
				break;
			case 3:
				right = "readable with considerable difficulty";
				break;
			case 4:
				right = "readable with practically no difficulty";
				break;
			case 5:
				right = "perfectly readable";
				break;
		}
		if(left == "" || right == ""){}
		else
			System.out.println(left + ", " + right + ".");
	}

}
