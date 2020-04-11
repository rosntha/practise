import java.util.Scanner;

public class SubtractionNoOperator {

	 static int Sub (int x, int y) {
		
		while(y!=0) {
			int carry=~x&y;
			x=x^y;
			y=carry<<1;
		}
		return x;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value");
		int a=sc.nextInt();
		System.out.println("Enter second value");
		int b=sc.nextInt();
		System.out.println("sum of two digits  "+Sub(a,b));
		

	}

}
