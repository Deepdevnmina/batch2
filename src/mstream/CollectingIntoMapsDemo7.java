package mstream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingIntoMapsDemo7 {

	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
		Map<Boolean, List<String>> map = ohMy.collect(
		 Collectors.partitioningBy(s -> s.length() <= 10));
		System.out.println(map); // {false=[], true=[lions, bears,tigers]}

	}
}
