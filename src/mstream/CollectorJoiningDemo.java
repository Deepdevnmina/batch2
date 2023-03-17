package mstream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorJoiningDemo {

public static void main(String[] args) {
	Stream<String> ohMy1 = Stream.of("lions", "tigers", "bears");
	
	String arrowStr1=ohMy1.collect(Collectors.joining("->"));
	System.out.println(arrowStr1);
	
	Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
	String arrowStr2=ohMy2.collect(Collectors.joining());
	System.out.println(arrowStr2);

	Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
	String result = ohMy3.collect(Collectors.joining(" ->> ","Mr. "," Welcome"));
	System.out.println(result); 
	//Mr. lions, tigers, bears Welcome
}
}
