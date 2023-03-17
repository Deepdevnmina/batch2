package mstream;

import java.util.ArrayList;
import java.util.List;

public class StreamMagicDemo {
	
	public static void main(String[] args) {
		//10
		List<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Guava");
		list.add("Banana");
		list.add("Grapes");
	/*	Stream<String> elements=list.stream();
		elements=elements.filter(d->d.length()>5);
		elements.forEach(tata->System.out.println(tata));*/
		list.stream().filter(d->d.length()>5).map(s->s.toUpperCase()).forEach(tata->System.out.println(tata));
		
	}

}
