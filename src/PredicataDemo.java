import java.util.function.Predicate;

public class PredicataDemo {
	public static void main(String[] args) {
		Predicate<String> predicate=t ->t.contains("te");
		System.out.println(predicate.test("Nagendrate"));
		System.out.println(predicate.test("joy"));
	}	
				
}
