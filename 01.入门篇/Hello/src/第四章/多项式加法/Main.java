package 第四章.多项式加法;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int len = 101;
		int[] a = arr(in, len);
		int[] b = arr(in, len);
		int[] r = new int[len];
		for(int i=0; i<r.length; i++){
			r[i] = a[i] + b[i];
		}
		// 输出a/b/r数组
		System.out.print("a:");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("b:");
		for(int i=0; i<b.length; i++){
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.print("r:");
		for(int i=0; i<r.length; i++){
			System.out.print(r[i] + " ");
		}
		System.out.println();
		// 打印
		int index = 1;
		for(int i=r.length-1; i>=0; i--){
			if(index != 1 && r[i] > 0)
				System.out.print("+");
			if(r[i]!=0){
				if(i!=0){
					index++;
					System.out.print((r[i] == 1 ? "" : (r[i] == -1 ? "-" : r[i])) + "x" + (i == 1 ? "" : i));
				}
				else
					System.out.print(r[i]);
			}
		}
	}

	public static int[] arr(Scanner in,int len){
		int[] arrlist = new int[len];
		int index;
		int value;
		do{
			index = in.nextInt();
			value = in.nextInt();
			arrlist[index] = value;
		}while(index != 0);
		return arrlist;
	}
}
