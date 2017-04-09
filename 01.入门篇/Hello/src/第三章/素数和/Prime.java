package 第三章.素数和;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] isPrime = new boolean[100];
		for(int i=0; i<isPrime.length; i++)
			isPrime[i] = true;
		for(int i=2; i<isPrime.length; i++){
			if(isPrime[i]){
				for(int k=2; i*k<isPrime.length; k++)
					isPrime[i*k] = false;
			}
		}
		for(int i=2; i<isPrime.length; i++){
			if(isPrime[i])
				System.out.print(i + " ");
		}
	}

}
