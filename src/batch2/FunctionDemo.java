package batch2;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo {
	
	public static void main(String[] args) {
		Predicate<String>  predicate=new Predicate<String>() {
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		//Function is always used for conversion 
		/*Function<Integer, String> function=new Function<Integer, String>() {
			@Override
			public String apply(Integer t) {
				return t -> "Mr. "+t
			}
		};*/
		
	/*	Function<Integer, String> function=(Integer t) -> {
				//write logic for conversion
 				return t -> "Mr. "+t
			};*/
		
		/*Function<Integer, String> function=(Integer t) -> t+"";*/
		/*Function<Integer, String> function=(t) -> t+"";*/
		Function<Integer, String> function= t -> "Mr. "+t;
		String output=function.apply(9233);
		System.out.println(output);
		
		 output=function.apply(1000);
		System.out.println(output);
		
		 output=function.apply(2000);
		System.out.println(output);
	}

}
