import java.util.function.Consumer;

public class ReferenceToStaticMethod3 {

	public static void main(String[] args) {
		/*Consumer<String> insisn=(String t) ->System.out.println(t);;*/
		Consumer<String> insisn=System.out::println; // println is non static method
	}
	
}
