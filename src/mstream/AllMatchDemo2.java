package mstream;

import java.util.stream.Stream;

public class AllMatchDemo2 {
	public static void main(String[] args) {
	
		Stream<String>  stream=Stream.of("Nagendra","Jack","James","Aaron");
		boolean b=stream.allMatch(s->s.length()>5);
		System.out.println(b);
		
		Stream<String>  names=Stream.generate(()->"Andy");
		boolean c=names.allMatch(s->s.length()>2);
		System.out.println(c);
	}
}


