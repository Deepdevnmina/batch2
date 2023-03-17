package mstream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingIntoMapsDemo5 {

	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("tear","lions","tea", "tigers", "teap","bears","nagendra","manisha","James","Rocks","owow","mo","tea");
		Map<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length));
		System.out.println(map); // {5=[lions, bears], 6=[tigers]}
		System.out.println(map.getClass());
		map.forEach((key,value)->System.out.println("key - "+key+" , value - "+value));

	}
}
