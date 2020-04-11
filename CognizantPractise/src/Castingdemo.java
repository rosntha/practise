
class Casting
{
	public void act()
	{
		System.out.println("Casting...");
	}
}



public class Castingdemo extends Casting
{
	
	public void act() {
		System.out.println("Castingdemo");
	}

	public static void main(String[] args) {
		
		
		
		Casting c= new Castingdemo();
		c.act();
		
	Casting ca=new Castingdemo();
		ca.act();
		Castingdemo caa=  (Castingdemo) ca;
		caa.act();
		

	}

}
