import java.util.function.Supplier;

class Dog {
	String name = "Rocky";
	String color = "white";
	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + "]";
	}
}

public class SupplierDemsss {
	public static void main(String[] args) {
          /*Supplier<Dog> sss=new Supplier<Dog>() {
			@Override
			public Dog get() {
				return new Dog();
			}
		};*/
		Supplier<Dog> sss=() -> new Dog();
		printa(() ->new Dog());
	}
	
	private static void printa(Supplier<Dog> sss) {
		Dog  dog=sss.get();
		System.out.println(dog);
	}
}
