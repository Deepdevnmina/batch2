package mstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapStreamAPI3 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Guava");
		list.add("Banana");
		list.add("Grapes");
		Stream<String> streams=list.stream();
		//Stream<Integer>
		Stream<Integer> intstream=streams.map((String t) ->t.length());
		intstream.forEach(System.out::println);
	}
}
