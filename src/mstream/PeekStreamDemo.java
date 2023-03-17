package mstream;

import java.util.stream.Stream;

public class PeekStreamDemo {
     public static void main(String[] args) {
    	 Stream<Integer> stream = Stream.iterate(1,i->++i); //1 2 3 4 5 6 7 8 9 10 11
    	 //Stream<Integer> tstream=stream.map(i->i*2); //2 4 6 8 10 12 14 16 18 20 22
    	 //Stream<Integer> stream2=tstream.limit(50).peek(s->System.out.println("Peek with "+s));
    	 //Stream<Integer> stream3 =stream2.skip(5);
    	 //System.out.println(stream3);
    	 System.out.println("@)@)@)@Pinting the data(@(@@*@");
    	// stream3.forEach(System.out::println);
    	 stream.map(i->i*2).limit(50).peek(s->System.out.println("Peek with "+s)).skip(5).forEach(System.out::println);
    	 
     }
}