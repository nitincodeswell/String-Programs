package strprgs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Map;

public class countwords {
	public static Map<Character, Integer> cwords(String w) {
		
		HashMap<Character, Integer> map =new HashMap<Character, Integer>();
		
		char[] ch=w.replaceAll("\\s", "").toLowerCase().toCharArray();
		for (Character str : ch) {
			if (!map.containsKey(str)) {
				map.put(str, 1);
			} else {
				map.put(str,map.get(str)+1);
			}
		}
		
		return map;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(cwords("The Indian Institutes of Technology (, or IITs, are a group of seven autonomous engineering and technology-oriented institutes of higher education established and declared as Institutes of National Importance by the Government of India. These institutes were created to train scientists and engineers to develop a skilled workforce with the aim of bolstering India's economic and social development after independence in 1947. The students and alumni of IITs are colloquially referred to as IITians. The first IIT was established at Kharagpur in 1951, followed by similar establishments at Mumbai, Chennai, Kanpur, Delhi, Guwahati and Roorkee. Although each IIT is an autonomous university, they are linked through a common IIT Council to oversee their administration. They have a common admission process, using the Joint Entrance Examination (popularly known as IIT-JEE) to select around 4,000 candidates. About 15,500 undergraduate and 12,000 graduate students study in the seven IITs in addition to research scholars. Many IITians have achieved success in a variety of professions, resulting in the establishment of the widely recognised IIT Brand. The success of the IITs has led to the creation of similar institutes in other "));
	}
}
