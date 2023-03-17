package mstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream2 {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("Nagendra","Maks","Jacks","Oeueue");
		Stream<String> parallel=list.parallelStream();
 
	}
}
