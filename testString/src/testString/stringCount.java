package testString;

import java.util.HashMap;
import java.util.HashSet;

public class stringCount {
	public static void count(String s) {
		//creating a HashMap, key: Character value: occurrences 
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		//converting inputString to char array
		char arr[]=s.toCharArray();
		
		//traversal of each character of char array
		for (char c:arr) {
			
			
			if(hm.containsKey(c)) {
				
				//if char is present in hm, increment its count by 1
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				//if char is not present more than once repeatation
				//assign 1 as its repeatation
				hm.put(c, 1);
			}
		}
		
		//showing count map
		System.out.println("The character is repeated as "+ hm+"\n");
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		count("rosnworkspace");
		

	}

}
