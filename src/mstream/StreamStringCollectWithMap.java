package mstream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStringCollectWithMap {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Nagendra","James","AaronT","Jack");
		Stream<String>  stream=names.stream();
		
		Map<Integer,String> output=stream.map(String::toUpperCase).collect(Collectors.toMap(String::length, String::toUpperCase));
		System.out.println(output);
		
	}
	
}
