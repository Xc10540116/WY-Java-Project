package 第三章.素数和;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int left = in.nextInt();
		int right = in.nextInt();
		int result = 0;
		for(int i=2,j=0; ; i++){
			if(isPrime(i))
				j++;
			if(j==left){
				result = i;
				break;
			}
		}
		if(left == right){}
		else {
			for(int i=result+1,j=left; ; i++){
				if(isPrime(i)){
					result += i;
					j++;
				}
				if(j==right)
					break;
			}
		}
		System.out.println(result);
		in.close();
	}

	public static Boolean isPrime(int number) {
		for(int i=2; i<number; i++){
			if(number % i == 0)
				return false;
		}
		return true;
	}
}
