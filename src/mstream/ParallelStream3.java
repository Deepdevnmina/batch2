package mstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream3 {

	public static void main(String[] args) {
		 int cores=Runtime.getRuntime().availableProcessors();
		 Arrays.asList(1,2,3,4,5,6)
		 .parallelStream().peek(s->{
			 System.out.println(Thread.currentThread().getName()+" says.."+s);
		 })
		 .forEach(s -> System.out.println(Thread.currentThread().getName()+" prints.."+s)); 
		 Arrays.asList(1,2,3,4,5,6)
		 .parallelStream()
		 .forEach(s -> System.out.print(s+" "));
	}
}
