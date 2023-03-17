package java8;

import java.io.Serializable;

public class Dog implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private transient int price;
	private  static int max=100; 

	public Dog(String name, int price) {
		super();
		System.out.println("DogDogDogDogDogDogDogDogDogDogDogDogDogDogDogDogDogDogDogDogDog");
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", price=" + price + "]";
	}
}
