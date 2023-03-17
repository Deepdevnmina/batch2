package mstream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SkipStreamExample {
	public static void main(String[] args) {
		Stream.of("one", "two", "three", "four"). //Stream<String>
				 filter(e -> e.length() > 3)  //Stream<String>
				.peek(e -> System.out.println("Filtered value: " + e)) ////Stream<String>
				.map(String::toUpperCase) ////Stream<String> ->>All String in caps
				.peek(e -> System.out.println("Mapped value: " + e))//Stream<String>
				.collect(Collectors.toList());  //List<String>
	}
}
