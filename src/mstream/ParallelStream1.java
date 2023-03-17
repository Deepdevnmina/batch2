package mstream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelStream1 {

	public static void main(String[] args) {
		Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6).stream();
		Stream<Integer> parallelStream = stream.parallel().parallel().parallel(); 
		boolean b=stream.isParallel();
		System.out.println("b = "+b);

	}
}
