package defaultPackage;

@SuppressWarnings("unused")
public class Car {
	private String make;
	private String model;
	private String color;
	private int year;
	
	Car(String make, String model, String color, int year) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
	}
	
	Car(Car car) {
		this.copy(car);
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void copy(Car x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setColor(x.getColor());
		this.setYear(x.getYear());
	}
	
	@Override
	public String toString() {
		return this.make + " " + this.model + ", " + this.color + ", " + this.year;
	}
}
