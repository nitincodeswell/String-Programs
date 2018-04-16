package strprgs;

public class stringrep {
	
	public static String stringreplace(String str,String rep,String replacewith ){
		int n=rep.length();
		
		
		for (int i = 0; i+n-1 < str.length(); i++) {
			if(str.charAt(i)==rep.charAt(0) && i+n-1<str.length()){
				if(str.substring(i, i+n).equals(rep)){
					str=str.substring(0, i)+replacewith+str.substring(i+n, str.length());
				}
			}
			
		}
		
		
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(stringreplace("nitin nitin", "iti", "aks"));
	}

}
