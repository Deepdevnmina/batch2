package mstream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStringReduceDemo {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Nagendra","James","Aaron","Jack","Nagendra");
		Stream<String>  stream=names.stream();
		Optional<String> result=stream.reduce((s1,s2)->s1.concat(" - "+s2));
		if(result.isPresent()) {
			System.out.println(result.get());
		}else {
			System.out.println("I am sorry data is not there");
		}
	}
	
}
