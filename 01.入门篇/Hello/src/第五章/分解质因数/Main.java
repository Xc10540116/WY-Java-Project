package 第五章.分解质因数;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int in = scanner.nextInt();
		if(in < 2 || in > 100000)
			System.exit(-1);
		// 如果是素数，输出in=in
		if(isPrime(in)){
			System.out.println(in + "=" + in);
			System.exit(0);
		}
		System.out.print(in + "=");
		do {
			for(int i=2; i<in; i++){
				if(in%i == 0){
					in = in / i;
					System.out.print(i + "x");
					break;
				}
			}
		} while(!isPrime(in));
		System.out.print(in);
		scanner.close();
	}
	
	public static boolean isPrime(int n){
		boolean[] arr = new boolean[n+1];
		for(int i=0; i<arr.length; i++)
			arr[i] = true;
		for(int i=2; i<arr.length; i++){
			if(arr[i]){
				for(int j=2; i*j<arr.length; j++)
					arr[i*j] = false;
			}
		}
		return arr[n];
	}

}
