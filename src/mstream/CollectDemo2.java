package mstream;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo2 {
	
	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
		//Map<String,Integer> names=ohMy.map(String::toUpperCase).collect(Collectors.toMap(k->"Mr."+k, v->v.length()));
		Map<String,Integer> names=ohMy.map(String::toUpperCase).collect(Collectors.toMap(k->"Mr."+k, String::length));
		System.out.println(names);
	}

}
