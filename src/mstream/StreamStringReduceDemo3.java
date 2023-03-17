package mstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamStringReduceDemo3 {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Nagendra","James","Aaron","Jack","Nagendra");
		Stream<String>  stream=names.stream();
		String result=stream.reduce("Mr. ", (s1,s2)->s1.concat(" - "+s2),(s1,s2)->s1.concat(" # "+s2));
		System.out.println(result);
		
	}
	
}
