package mstream;

import java.util.stream.Stream;

public class ParallelStreamExample {
	
	public static void main(String[] args) {
		Stream<Integer> streams=Stream.of(10,20,30,40,60,70,80,90,100,110,120);
		System.out.println(streams);
		streams.forEach((Integer d)->System.out.print(d+"  "));
		
		Stream<Integer> tstreams=Stream.of(10,20,30,40,60,70,80,90,100,110,120);
	    tstreams.parallel();
		System.out.println("%%%%%%%%%%%%Another output%%%%%%%%%%%%%%%%%");
		System.out.println(tstreams.isParallel());
		tstreams.forEach((Integer d)->System.out.print(d+"  "));
		System.out.println("\nNo of processors is = ");
		int processors=Runtime.getRuntime().availableProcessors();
		System.out.println(processors);
	}
}
