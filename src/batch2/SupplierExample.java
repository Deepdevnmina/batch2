package batch2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class SupplierExample {
	
	public static void main(String[] args) {
	Supplier<String> supplier =new Supplier<String>() {
			@Override
			public String get() {
				return "Hell0 Mr. how are you ?????";
			}
		};
		
		Supplier<String> supplier2 =() -> {return  "Hell0 Mr. how are you ?????";};
		Supplier<String> supplier3 =() -> "Hell0 Mr. how are you ?????";
		
		/*Consumer<String> consumer=new Consumer<String>() {
			@Override
			public void accept(String t) {
                  int len =t.length();
                  System.out.println(len); // I am using it
			}
		};*/
		
		/*Consumer<String> consumer=new Consumer<String>() {
			@Override
			public void accept(String t) {
                  System.out.println(t.length()); // I am using it
			}
		};*/
		
	/*	Consumer<String> consumer=(String t) -> {
                  System.out.println(t.length()); // I am using it
			};
		*/
		
		//Lambda expression is an instance or object of anonymous classs
		Consumer<String> consumer=(String t) ->  System.out.println(t.length()); // I am using it
		consumer.accept("Nagendra");
		
/*		Supplier<String> supplier =() ->  {
				return "Hell0 Mr. how are you ?????";
			};
*/
		/*Supplier<String> supplier =() ->"Hell0 Mr. how are you ?????"; // right side is an instance of anonymous class!!! 
		
		magic(supplier);
		
		magic(() ->"Hell0 Mr. how are you ?????");*/
		
		
	}
	
	public static void magic(Supplier<String> supplier) {
		String result=supplier.get();
		System.out.println(result);
	}

}
