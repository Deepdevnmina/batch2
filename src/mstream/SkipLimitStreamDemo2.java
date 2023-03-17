package mstream;

import java.util.stream.Stream;

public class SkipLimitStreamDemo2 {
	
	public static void main(String[] args) {
		Stream<Integer> streams=Stream.iterate(0,(s)->s+2); // 0 2 4 6 8 10 12 14
		streams=streams.skip(4);
		streams=streams.limit(200); //limit is intermediate operation
		streams.forEach(System.out::println);
	}

}
