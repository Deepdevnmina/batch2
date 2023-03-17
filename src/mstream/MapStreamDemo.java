package mstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapStreamDemo {
	
	public static void main(String[] args) {
		//10
		List<String> list=Arrays.asList("Apple","Mango","Guava","Banana","Grapes");
		Stream<String> streams=list.stream();
		System.out.println(streams);//java.util.stream.ReferencePipeline$Head@7a81197d
		streams=streams.filter((String s)->s.length()>5);
		streams=streams.map((String s)->s.toUpperCase()); //who does same input and same output -> UnaryOperator
		streams.forEach(System.out::println);
	}

}
