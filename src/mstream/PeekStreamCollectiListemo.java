package mstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekStreamCollectiListemo {
     public static void main(String[] args) {
    	 Stream<Integer> stream = Stream.iterate(1,i->++i); //1 2 3 4 5 6 7 8 9 10 11
    	 List<Integer> integers =stream.map(i->i*2).limit(50).peek(s->System.out.println("Peek with "+s)).skip(5).collect(Collectors.toList());
    	 System.out.println(integers);
    	 
     }
}