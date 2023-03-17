package mstream;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo1 {
	
	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears","tigers");
		Set<String> names=ohMy.map(String::toUpperCase).collect(Collectors.toSet());
		System.out.println(names);
		System.out.println(names.getClass());
	}

}
