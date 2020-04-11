import java.util.Scanner;

public class PowerOf {

	public static void main(String[] args) {
		
		int i,n,result=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base of number");
		
		i=sc.nextInt();
		System.out.println("enter power of number");
		
		n=sc.nextInt();
		
		while(i!=0)
		{
			result=result*n;
			
			--i;
			
			
		}
		
		
		System.out.println("the power of "+i+"is"+ result);
		

	}

}
