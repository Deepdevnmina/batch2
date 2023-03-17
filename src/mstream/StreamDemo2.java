package mstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {
	
	public static void main(String[] args) {
		//10
		List<String> fruits=Arrays.asList("Apple","Mango","Guava","Banana");
		Stream<String> streams=fruits.stream();
		System.out.println(streams);
		//1 stream we can only consumes once
		//streams.forEach((String t)->System.out.println(t));
		streams.forEach(System.out::println);
		//streams.forEach(s->System.out.println(s));
	}

}
