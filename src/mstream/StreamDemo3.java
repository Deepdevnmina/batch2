package mstream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo3 {
	
	public static void main(String[] args) {
		//10
		String[] array=new String[] {"Apple","Mango","Guava","Banana"};
		Stream<String> streams=Arrays.stream(array);
		System.out.println(streams);
		//1 stream we can only consumes once
		//streams.forEach((String t)->System.out.println(t));
		streams.forEach(System.out::println);
		//streams.forEach(s->System.out.println(s));
	}

}
