package 第2章.分数;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}

class Fraction {
	private int a;
	private int b;
	
	Fraction(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public double toDouble(){
		return (double)a / b;
	}
	
	public Fraction plus(Fraction r){
		int denominator = b * r.b;
		int numerator = a * r.b + r.a * b;
		Fraction newFraction = new Fraction(numerator,denominator);
		return newFraction;
	}
	
	public Fraction multiply(Fraction r){
		int denominator = r.b * b;
		int numerator = a * r.a;
		int n = maxCommonDivisor(numerator, denominator);
		numerator = numerator / n;
		denominator = denominator / n;
		Fraction newFraction = new Fraction(numerator,denominator);
		return newFraction;
	}
	
	public void print(){
		int n = maxCommonDivisor(a,b);
		a = a / n;
		b = b / n;
		if(a == b)
			System.out.println(a);
		else
			System.out.println(a + "/" + b);
	}
	
	// 计算最大公约数
	private int maxCommonDivisor(int m, int n){
		if (m < n) {// 保证m>n,若m<n,则进行数据交换  
			int temp = m;
			m = n;
			n = temp;
        }  
		while (m % n != 0) { // 在余数不能为0时,进行循环    
			int temp = m % n;
			m = n;
			n = temp;
        }
		return n;
	}
}