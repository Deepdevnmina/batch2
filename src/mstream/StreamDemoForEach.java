package mstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemoForEach {
	
	public static void main(String[] args) {
		//10
		List<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Guava");
		list.add("Banana");
		list.add("Grapes");
		System.out.println(list);//[Apple, Mango, Guava, Banana, Grapes]
		list.forEach(ta->System.out.println(ta));
		list.forEach(ta->System.out.println(ta));
		list.forEach(ta->System.out.println(ta));
		System.out.println("@)@)(@(@(@....");
		Stream<String> streams=list.stream(); //java.util.stream.ReferencePipeline$Head@7a81197d
		//1 stream we can only consumes once
		//streams.forEach((String t)->System.out.println(t));
		streams.forEach(ta->System.out.println(ta));
		
		//streams.forEach(ta->System.out.println(ta));
		//streams.forEach(s->System.out.println(s));
	}

}
