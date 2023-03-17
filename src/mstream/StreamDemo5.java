package mstream;

import java.util.stream.Stream;

public class StreamDemo5 {
	
	public static void main(String[] args) {
		Stream<Integer> streams=Stream.iterate(0,(s)->s+2); // 1 2 3 4 5 6 7 
		System.out.println(streams);
		//1 stream we can only consumes once
		//streams.forEach((String t)->System.out.println(t));
		
		//streams.forEach(s->System.out.println(s));
		streams.forEach(s->System.out.println());
		streams.forEach(System.out::println);
	}

}
