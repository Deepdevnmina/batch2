package mstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemoForCount {
	
	public static void main(String[] args) {
		//10
		List<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Guava");
		list.add("Banana");
		list.add("Grapes");
		System.out.println(list);//[Apple, Mango, Guava, Banana, Grapes]
		System.out.println("@)@)(@(@(@....");
		Stream<String> streams=list.stream(); //java.util.stream.ReferencePipeline$Head@7a81197d
		long len=streams.count();
		System.out.println(len);
	}

}
