package org.syallabus;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Map2DwithHeader {

	public static void main(String[] args) {
	
		List<LinkedHashMap<String,String>>emp=new ArrayList<LinkedHashMap<String,String>>();
		//Insert in to innerList
		LinkedHashMap<String,String>m1=new LinkedHashMap<String,String>();
		m1.put("name"," mani");
		m1.put("email"," mani@gmail.com");
		m1.put("course"," SQl");
		
		LinkedHashMap<String,String>m2=new LinkedHashMap<String,String>();
		m2.put("name"," bala");
		m2.put("email"," bala@gmail.com");
		m2.put("course"," Java");
		
		
		LinkedHashMap<String,String>m3=new LinkedHashMap<String,String>();
		m3.put("name"," guna");
		m3.put("email"," guna@gmail.com");
		m3.put("course"," PLSQL");
		
		
		LinkedHashMap<String,String>m4=new LinkedHashMap<String,String>();
		m4.put("name","abu");
		m4.put("email"," abu@gmail.com");
		m4.put("course"," API");
		
		//OUTER LIST
		emp.add(m1);
		emp.add(m2);
		emp.add(m3);
		emp.add(m4);
		
		LinkedHashMap<String, String> s = emp.get(2);
		
		String s1 = s.get("course");
		System.out.println(s1);
		
		
		
		
		

		
	}

}
