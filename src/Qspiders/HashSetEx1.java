package Qspiders;

import java.util.*;

public class HashSetEx1 
{

	public static void main(String[] args) 
	{
		HashSet <Object> h=new HashSet <Object> ();
		h.add('A');
		h.add(100);
		h.add(2.5f);
		h.add("Btm");
		h.add('a');
		h.add("btm");
		
		System.out.println("Printing using for each loop");
		for(Object i : h) 
		{
			System.out.println(i);
		}
	
		System.out.println("using iterator");
		Iterator <Object> i=h.iterator();
		while(i.hasNext())
		{
			Object O=i.next();
			if(O=="Btm")
			{
				i.remove();
				
			}
			else
			{
				System.out.println(O);
			}				
		}	
	}
}