package Qspiders;

public class  Bike extends Vehicle {

	double price;

	public Bike(String brand, String color, double price) {
		super(brand, color);
		this.price = price;
	}

	public String toString() {
		return brand+" "+color+" "+price;

}
}