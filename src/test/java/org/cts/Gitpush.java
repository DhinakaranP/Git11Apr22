package org.cts;

import java.util.LinkedHashMap;
import java.util.Map;

public class Gitpush {
	
	private void add() {
		System.out.println("Aravind2");

	}
	public static void main(String[] args) {
		String s="welcome to java java class to class welcome";
		
		String[] sp = s.split(" ");
		
		Map<String, Integer> mp=new LinkedHashMap<String, Integer>();
		
		for (int i = 0; i < sp.length; i++) {
			
			String s1=sp[i];
			
			if(mp.containsKey(s1)) {
				Integer x = mp.get(s1);
				mp.put(s1, x+1);
			}
			else {
				mp.put(s1, 1);
			}
			}
		System.out.println(mp);
		
		}
	private void sub() {
		System.out.println("Aravind");

	}
	}