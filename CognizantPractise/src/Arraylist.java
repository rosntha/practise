import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();	
		list.add("roshan");
		list.add("ashish");
		list.add("akash");
		list.add("suma");
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Iterator <String> itr1=list.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		

	}

}
