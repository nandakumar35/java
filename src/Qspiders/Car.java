package Qspiders;


public class Car extends Vehicle {

double price;

public Car(String brand, String color, double price) {
	super(brand, color);
	this.price = price;
}

public String toString() {
	return brand+" "+color+" "+price;
}

}
