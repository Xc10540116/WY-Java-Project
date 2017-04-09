package 第五章.完数;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] list = new int[m];
		int lindex = 0;
		for(int i=n; i<=m; i++){
			int len = i/2==0 ? 1 : i/2;
			int[] arr = new int[len];
			int aindex = 0;
			int sum = 0;
			for(int j=1; j<=i/2; j++){
				if(i%j==0){
					arr[aindex] = j;
					aindex++;
				}
			}
			for(int j=0; j<arr.length; j++)
				sum += arr[j];
//			System.out.println(sum);
			if(sum == i){
				list[lindex] = i;
				lindex++;
			}
		}
		// 如果没有完数，输出NIL
		if(lindex == 0){
			System.out.println("NIL");
			System.exit(0);
		}
		
		// 输出完数
		for(int i=0; i<lindex; i++){
			System.out.print(list[i]);
			if(i<lindex-1)
				System.out.print(" ");
		}
	}

}
