package strprgs;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class allnewchar {//check weather string has all unique characters 

	public static boolean uniquechar(String str){ //type 1 sort string and compare
		String s=str.chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
		System.out.println(s+""+s.length());
		for (int i = 0; i < str.length()-1; i++) {
			
			if(s.charAt(i)==s.charAt(i+1)){
				return false;
			}
			
		}
		return true;
	}
	
	
	
	
	
	
	public static boolean unqiuehash(String str){
		
		Hashtable<Integer, Character> map =new Hashtable();
		for (int i = 0; i < str.length(); i++) {
			
			if (map.containsValue(str.charAt(i))) {
				map.put(map.get(str.charAt(i))+1,str.charAt(i));
				
			} else {
				map.put(1,str.charAt(i));
			}
			
		}
		System.out.println("Values before remove: "+ map);   
		for (Entry<Integer, Character> iter: map.entrySet()) {
			System.out.println(map);
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		System.out.println(uniquechar("akshay"));
		System.out.println(unqiuehash("akshay"));
	}
	
	
	
}
