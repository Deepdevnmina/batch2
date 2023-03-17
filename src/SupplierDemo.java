import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args) {
		Supplier<String> suppler=() ->"No no no  it does not take any input";
			
		String result=suppler.get();
		System.out.println(result);
	}

}
