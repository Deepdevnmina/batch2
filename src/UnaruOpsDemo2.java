import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaruOpsDemo2 {
	public static void main(String[] args) {
      /*   UnaryOperator<String> function=new UnaryOperator<String>() {
			@Override
			public String apply(String t) {
				return t.toUpperCase();
			}
		};	*/
		  Function<String,String> function1 = t -> t.toUpperCase();
		  UnaryOperator<String> function2 = t -> t.toUpperCase();
	}
}
