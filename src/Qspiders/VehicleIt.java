package Qspiders;

import java.util.ArrayList;
import java.util.ListIterator;
public class VehicleIt {

public static void main(String[] args) {
	ArrayList <Vehicle> al=new ArrayList <Vehicle> ();
	al.add(new Car("Tata","Blue",829000.0));
	al.add(new Bike("RE","Black",120000.0));
	al.add(new Car("Hyundai","White",930000.0));
	al.add(new Bike("Yamaha","Red",79000.0));
	
	ListIterator <Vehicle> i=al.listIterator();
	System.out.println("Printing in forward direction");
	while(i.hasNext()){
		System.out.println(i.next());
	}
	
	System.out.println("Printing in backward direction");
	while(i.hasPrevious()){
		System.out.println(i.previous());
	}
	
}
}
