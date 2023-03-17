class Fruit {
	private String name;
	private String color;

	public Fruit(String name, String color) {
		this.name = name;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + "]";
	}

}
interface FruitSupplier{
	public Fruit produce(String name,String color);
}

public class ReferenceToCons {
	public static void main(String[] args) {

		/*FruitSupplier fruitSupplier= new FruitSupplier() {
			@Override
			public Fruit produce(String name, String color) {
				return new Fruit(name, color);
			}
		};*/
/*		FruitSupplier fruitSupplier= (String name, String color) -> {
				return new Fruit(name, color);
			};*/
	/*	FruitSupplier fruitSupplier= (String name, String color) -> new Fruit(name, color);
		*/
		FruitSupplier fruitSupplier= Fruit::new;
		Fruit fruit=fruitSupplier.produce("Apple","red");
		System.out.println(fruit);
	}
	
}
