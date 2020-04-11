import java.util.Scanner;

public class FindSum {

	public static void main(String[] args) {
		int i,n,sum=0,temp;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		//temp=n;
		while(n>0) {
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("the sum is"+sum);
	}

}
