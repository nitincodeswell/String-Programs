package strprgs;

public class palindromenumber {
	public static int palindromenum (int num){
		int temp = 0;
		while(num!=0){
			temp=+ num/10;
		}
		return temp;
	}
	
	public static void main(String[] args){
		System.out.println(palindromenum(151));		
	}
}
