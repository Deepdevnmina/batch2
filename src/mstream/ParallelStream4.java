package mstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream4 {

	public static void main(String[] args) {
		Arrays.asList("jackal","kangaroo","lemur")
		 .parallelStream()
		 .map(s -> s.toUpperCase())
		 .forEach(System.out::println); 
	}
}
