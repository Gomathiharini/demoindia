package org.syallabus;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapOneDwithHeader {

	public static void main(String[] args) {
		Map<String,String> emp=new LinkedHashMap<String,String>();
		
		emp.put("name", "Bala");
		emp.put("email","bala@gmail.com");
		emp.put("course", "Java");
		String s= emp.get("email");
		System.out.println(s);

	}

}
