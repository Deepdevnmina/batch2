import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
	/*	Function<String,Integer> function=new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};*/
		Function<String,Integer> function=(String t) ->t.length();
		int rafi=function.apply("Nagendra");
		System.out.println(rafi);
	}
	
}
