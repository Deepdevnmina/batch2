package mstream;

import java.util.stream.Stream;

public class LimitStreamDemo {
	
	public static void main(String[] args) {
		Stream<Integer> streams=Stream.iterate(0,(s)->s+2); // 1 2 3 4 5 6 7
		streams=streams.limit(200); //limit is intermediate operation
		streams.forEach(System.out::println);
	}

}
