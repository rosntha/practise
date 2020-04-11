
public class FibonacciSeries {

	public static void main(String[] args) {
		int x=0;
		int y=1;
		int z;
		System.out.println(x);
		System.out.println(y);
		
		for(int i=2;i<10;i++) {
			z=x+y;
			x=y;
			y=z;
			System.out.println(y);
			
		}
		

	}

}
