import java.util.Scanner;

public class Reversenum {

	public static void main(String[] args) {
		int i,temp,sum=0,n;
		System.out.print("enter number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0) {
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.out.print("reverse of number is:"+sum);
		

	}

}
