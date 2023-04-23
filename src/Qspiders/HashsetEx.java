package Qspiders;

import java.util.*;

public class HashsetEx {

	public static void main(String[] args) {
		HashSet <Character> h=new HashSet <Character> ();
		h.add('A');
		h.add('B');
		h.add('E');
		h.add('D');
		h.add('A');
		h.add('D');
		
		System.out.println("Printing using for each loop");
		for(Character i : h) {
			System.out.println(i);
		}
		
		System.out.println("using iterator");
		Iterator <Character> i=h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
