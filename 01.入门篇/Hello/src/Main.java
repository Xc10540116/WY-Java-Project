import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Fahrenheit;
		int Celsius;
		Scanner in = new Scanner(System.in);
		System.out.print("请输入华氏温度：");
		Fahrenheit = in.nextInt();
		Celsius = (int)((Fahrenheit - 32) * (5/9.0));
		System.out.println("华氏温度为：" + Celsius);
		in.close();
	}
}
