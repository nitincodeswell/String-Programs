package strprgs;

public class reverse {

	public static String reverseString(String x){
		
		StringBuilder sb = new StringBuilder();
		for (int i = x.length()-1;i >=0; i--) {
			sb.append(x.charAt(i));
		}
		return sb.toString();

	}
	public static void main(String[] args){
		System.out.println(reverseString("akshay"));		
	}
}
