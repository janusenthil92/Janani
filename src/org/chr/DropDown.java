package org.chr;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DropDown {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(10);
		
		Set<Integer> s=new LinkedHashSet<>();
		s.addAll(li);
		System.out.println(li.size()-s.size());
		
		
		
		
		
		
		
	}
		
		
	} 
  


