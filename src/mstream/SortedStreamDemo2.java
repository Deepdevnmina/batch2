package mstream;

import java.util.Arrays;
import java.util.List;

public class SortedStreamDemo2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		list.stream().limit(2).filter(n -> n.length() > 3).sorted().
		forEach(System.out::println);
	}
}
