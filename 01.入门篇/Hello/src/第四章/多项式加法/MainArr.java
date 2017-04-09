package 第四章.多项式加法;

import java.util.Scanner;

public class MainArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] input = new int[101];
		int power;	// 幂次
		int coef;	// 系数
		in.close();
		
		// 生成最终数组
		for(int flags=0; flags<2; flags++){
			do {
				power = in.nextInt(); 	// 幂次
                coef = in.nextInt(); 	// 系数
                
                if(power > 100)
                	System.exit(-1);
                
                input[power] += coef;
			}while(power!=0);
		}
		
		//打印数组
		for(int i=0; i<input.length; i++){
			System.out.print(input[i] + " ");
		}
		System.out.println();
		
		//如果数组的值全部为0，这返回0
		int sum = 0;
		for(int i=0; i<input.length; i++){
			sum += input[i];
		}
		if(sum == 0){
			System.out.println(0);
			System.exit(0);
		}
		
		// 打印
		int index = 1;
		for(int i=input.length-1; i>=0; i--){
			if(index != 1 && input[i] > 0)
				System.out.print("+");
			if(input[i]!=0){
				if(i!=0){
					index++;
					System.out.print((input[i] == 1 ? "" : (input[i] == -1 ? "-" : input[i])) + "x" + (i == 1 ? "" : i));
				}
				else
					System.out.print(input[i]);
			}
		}
	}

}
