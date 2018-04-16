package strprgs;

import java.util.Arrays;

public class uniq {
	
	public static Boolean unique(String k){
	
		char[] a = k.toCharArray();
		Arrays.sort(a);
		for (int i = 0; i < a.length-1; i++) {
			if (a[i]==a[i+1]) {
				return false;
			} 
			
		}
//		for (int i = 0; i < a.length-1; i++) {
//			for (int j = i; j < a.length-1; j++) {
//				if(a[i]==a[j+1]){
//					return false;
//				}
//				
//			}
//			
//		}
		
		
		return true;
	}
	public static void main(String[] args){
		System.out.println(unique("Akshay"));
	}

}
