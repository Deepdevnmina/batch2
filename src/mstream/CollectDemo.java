package mstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
	
	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears","tigers");
		List<String> names=ohMy.map(s->"Mr. "+s.toUpperCase()).collect(Collectors.toList());
		System.out.println(names);
	}

}
