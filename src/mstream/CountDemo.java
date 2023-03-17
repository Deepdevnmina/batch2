package mstream;

import java.util.stream.Stream;

public class CountDemo {
	public static void main(String[] args) {
		Stream<String>  stream=Stream.of("Nagendra","Jack","James","Aaron");
		long size=stream.count();
		System.out.println(size);
	}
}


