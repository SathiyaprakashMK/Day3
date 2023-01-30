package week2.day1;

public class Calculator {

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		int c=cal.additionTwoNumber(50, 60);
		System.out.println("The sum is "+c);
		int d=cal.subractionTwoNumber(60, 20);
		System.out.println("The difference is "+d);
		double g=cal.multipleTwoNumber(10, 20);
		System.out.println("The product is "+g);
		float h=cal.divideTwoNumber(70,5);
		System.out.println("The division is "+h);

	}
	public int additionTwoNumber(int a,int b) {
		return a+b;
	}
	public int subractionTwoNumber(int e,int f) {
		return e-f;
	}
	public double multipleTwoNumber(double i,double j) {
		return i*j;
	}
	public float divideTwoNumber(float x,float y) {
		return x/y;
	}
}
