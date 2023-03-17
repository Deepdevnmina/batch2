package mstream;

//Object is parent of all the classes

//I want to give sorting behavior for Dog
//Comparable is used to define default sorting behavior for
//an object
public class Dog  implements Comparable<Dog>{
	private String name;
	private String color;
	private int price;

	public Dog(String name, String color, int price) {
		super(); // calling parent class cons
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Dog o) {
		int p= name.compareTo(o.getName());
		return p;
	}

}
