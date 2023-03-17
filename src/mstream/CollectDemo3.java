package mstream;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo3 {
	
	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions", "tigers", "Foo");
		Map<Integer,String> names=ohMy.map(String::toUpperCase).collect(Collectors.toMap(String::length,k->k));
		//System.out.println(names);
		//forEach is taking BiConsumer
		names.forEach((k,v)->System.out.println("key = "+k+" and value = "+v));
	}

}
