package org.syallabus;

import java.util.ArrayList;
import java.util.List;

public class DetaTableList {

	public static void main(String[] args) {
		List<ArrayList<String>>emp=new ArrayList <ArrayList<String>>();
		
		//Insert in to inner List
		
		ArrayList<String>a1= new ArrayList<String>();
     a1.add("Ram");
     a1.add("Ram@gmail.com");
     a1.add("java");

		ArrayList<String>a2=new ArrayList<String>();
		a2.add("Bala");
		a2.add("Bala@gmail.com");
		a2.add("sql");

      ArrayList <String>a3= new ArrayList<String>();
      a3.add("Guna");
      a3.add("Guna@gmail.com");
      a3.add("API");


    ArrayList<String>a4=new ArrayList<String>();

    a4.add("Abu");
    a4.add("Abu@gmail.com");
    a4.add("Selenium");
    
    //Insert in to OuterList
    emp.add(a1);
    emp.add(a2);
    emp.add(a3);
    emp.add(a4);
    
    //Outer list reff
    
    
    ArrayList<String> arrayList = emp.get(2);
    
    String string = arrayList.get(2);
    
    
    System.out.println(string);
}
	}


