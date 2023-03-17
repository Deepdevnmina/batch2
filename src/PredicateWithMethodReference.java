import java.util.function.Predicate;

public class PredicateWithMethodReference {

	public static void main(String[] args) {
		/*Predicate<String> ststst=(String t) ->t.isEmpty();*/
	
			Predicate<String> ststst=String::isEmpty;
		
	}
	
}
