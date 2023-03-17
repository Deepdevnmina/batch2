package mstream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingIntoMapsDemo8 {

	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
		Map<Boolean, List<String>> map = ohMy.collect(
		 Collectors.groupingBy(s -> s.length() <= 10));
		System.out.println(map); // {false=[tigers], true=[lions, bears]}

	}
}
