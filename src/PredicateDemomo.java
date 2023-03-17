import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemomo {
	
	public static void main(String[] args) {
		Predicate<String> ewrwr=new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.contains("a");
			}
		};
		/*Predicate<String> ewrwr=(String t) -> t.contains("a");*/
		//Predicate<String> ewrwr= t -> t.contains("a");
		//List<String>  list1=Arrays.asList("Nagendra","Ameya","Mocha","James","Jamie");
	//	List<String>  list2=List.of("Nagendra","Ameya","Mocha","James","Jamie");
		List<String>  list=new ArrayList<>();
		list.add("Nagendra");
		list.add("Ameya");
		list.add("Mocha");
		list.add("James");
		list.add("Jamie");
		System.out.println(list);
		 list.removeIf(t -> t.contains("a"));
		System.out.println("@)@02020");
		System.out.println(list);
	}

}
