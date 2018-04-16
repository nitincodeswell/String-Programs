package strprgs;

import java.util.ArrayList;
import java.util.Iterator;

class std{
	
	 String name;
	 String roll;
	 String dept;

	std(String name,String roll,String dept){
		this.name=name;
		this.roll=roll;
		this.dept=dept;
	}
	
}
public class student {



public static void main(String args[]){
	std s=new std("Akshay","10","Cs");
	std s1 = new std("Akshay","10","Cs");
	ArrayList<std> a =new ArrayList<std>();
	a.add(s);
	a.add(s1);
	
	Iterator<std> itr=a.iterator();  
	  //traversing elements of ArrayList object  
	  while(itr.hasNext()){  
	    std st=itr.next();  
	    System.out.println(st.roll+" "+st.name+" "+st.dept); 
	    
}
	  System.out.println(a.indexOf(10));
}
}
	
	

