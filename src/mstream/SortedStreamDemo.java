package mstream;

import java.util.Arrays;
import java.util.List;

public class SortedStreamDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		list.stream().filter(n -> n.length() == 4).limit(2).sorted()
		 .forEach(System.out::println);
		//  Alex Anna
	}
}
