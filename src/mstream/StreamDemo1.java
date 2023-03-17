package mstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {
	
	public static void main(String[] args) {
		//10
		List<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Guava");
		list.add("Banana");
		list.add("Grapes");
		System.out.println(list);//[Apple, Mango, Guava, Banana, Grapes]
		list.forEach(System.out::println);
		
		System.out.println("@)@)(@(@(@....");
		Stream<String> streams=list.stream(); //java.util.stream.ReferencePipeline$Head@7a81197d
		System.out.println(streams);
		//1 stream we can only consumes once
		//streams.forEach((String t)->System.out.println(t));
		streams.forEach(System.out::println);
		//streams.forEach(s->System.out.println(s));
	}

}
