import java.util.function.Function;

public class FunctionalDemo {
	public static void main(String[] args) {
          /*Function<String,Integer> function=new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};*/
/*		Function<String,Integer> function=(String t) -> {
				return t.length();
			};
*/
	//	Function<String,Integer> function=(String t) -> t.length();
		Function<String,Integer> function=t -> t.length();
		
	}
}
