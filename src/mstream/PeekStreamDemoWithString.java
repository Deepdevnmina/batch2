package mstream;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class PeekStreamDemoWithString {

	public static void main(String[] args) {
		
		Stream<String>  stream=Stream.of("Nagendra","James","Aaron","Jack");
		stream.peek(t->System.out.println(t)).map(String::toUpperCase).peek(t->System.out.println(t)).forEach(System.out::println);
		
	}
	
}
