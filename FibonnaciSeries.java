package wee1.day2;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int range = 8;
		int a =0;
		int b=1;
		int ab;
		System.out.println("The Fibonacci series are");
		
		for (int i = 0; i < range; i++) {
			
			ab = a+b;
			System.out.println(a);
			a=b;
			b=ab;
			
		}
	}
	

}
