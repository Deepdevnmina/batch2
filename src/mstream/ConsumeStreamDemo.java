package mstream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumeStreamDemo {
	
	public static void main(String[] args) {
		
		List<String> fruits=Arrays.asList("Apple","Mango","Guava","Banana");
		Stream<String> streams=fruits.stream();
		System.out.println(streams);
		//1 stream we can only consumes once
		//streams.forEach((String t)->System.out.println(t));
		streams.forEach(System.out::println);
		
		streams.forEach(s->System.out.println(s));
		
		/*Consumer<String> consumer=new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};

		streams.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});*/
	}

}
