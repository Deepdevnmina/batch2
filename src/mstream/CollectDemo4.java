package mstream;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo4 {
	
	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("NAGENT","lions", "tigers", "Foo","Monkey");
		Map<Integer,String> names=ohMy.map(String::toUpperCase).collect(Collectors.toMap(String::length,k->k,(k1,k2)->k1+","+k2));
		//System.out.println(names);
		//forEach is taking BiConsumer
		names.forEach((k,v)->System.out.println("key = "+k+" and value = "+v));
	}

}
