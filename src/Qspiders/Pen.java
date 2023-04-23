package Qspiders;

import java.util.ArrayList;
import java.util.Iterator;

public class Pen {
String brand;
double price;

public Pen(String brand,double price)
{
	this.brand=brand;
	this.price=price;
}

public String toString()
{
	return brand+"   "+price;
}

public static void main(String[] args) {
	ArrayList<Pen>p=new ArrayList<Pen>();
	p.add(new Pen("Reynolds",50.0));
	p.add(new Pen("Hero",100.0));
	p.add(new Pen("Cello",30.0));
	
Iterator <Pen> i=p.iterator();
while(i.hasNext());
	{
	System.out.println(i);
	}

}
}