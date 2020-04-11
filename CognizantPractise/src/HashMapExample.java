import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		System.out.println("elements of hashmap"+hm);
		hm.put(1, "roshan");
		hm.put(2, "ashish");
		hm.put(3,"purna");
		
		System.out.println("after invoking put() method");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
		
		hm.putIfAbsent(4,"jiten");
		System.out.println("After invoking putIfAbsent");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+"\t"+m.getValue());
			
		}
		HashMap<Integer,String> map=new HashMap<Integer,String>();

		hm.put(5,"j");
		map.putAll(hm);
		System.out.println("After invoking putAll");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+"\t"+m.getValue());
			
		}
		hm.remove(1);
		System.out.println(hm);

	}

}
