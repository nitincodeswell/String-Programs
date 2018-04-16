package strprgs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class reverseeachword {
	public static String reversingStringwords(String w){
		String[] words=w.split(" ");
		String[] rev=new String[words.length];
		String str = "";
		
	for (int i = 0; i < words.length; i++) {
			 str += reverse.reverseString(words[i])+" ";
			
			
		}
		
		
		 
		return str;
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(reversingStringwords("akshay a is good"));
		
		File file = new File("C:\\Users\\Akshay01\\Desktop\\Programming\\a.txt");
		 String st;
		 BufferedReader br = new BufferedReader( new FileReader(file));
		while ((st = br.readLine()) != null)
		    System.out.println(reversingStringwords(st));
		  
		 
		
		System.out.println(reversingStringwords("You need to write a function to implement an algorithm which will accept a string of characters and should find the highest occurrence of the character and display it. For example if input is aaaaaaaaaaaaaaaaabbbbcddddeeeeee it should return ."));
	}
	
	
}
