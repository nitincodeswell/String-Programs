package strprgs;

public class palindrome {
	public static String stringpalindrome(String s){
		StringBuilder sb = new StringBuilder();
		for(int i=s.length()-1;i>=0;i--){
			sb.append(s.charAt(i));
		}
		if(s.equals(sb.toString())){
			
			return "palindrome";
		}
		else{
			return "not a palindrome";
		}
		
		
	}
	public static void main(String[] args){
		System.out.println(stringpalindrome("nitin"));		
		
	}
}
