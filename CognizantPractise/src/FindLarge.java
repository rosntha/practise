import java.util.Scanner;

public class FindLarge {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Enter third number");
		int c=sc.nextInt();
		
		
		
		if(a-b>0 && a-c>0) {
			System.out.println("the largest number is: "+a);
		}
		else if(b-c>0) {
			System.out.println("the largest number is: "+b);
			
		}
		else
			System.out.println("the largest number is: "+c);
	}

}
