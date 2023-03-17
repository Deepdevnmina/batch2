package mstream;

import java.util.stream.Stream;

public class NoneMatchDemo {
	public static void main(String[] args) {
		Stream<String>  stream=Stream.of("Nagendra","Jack","James","Aaron");
		boolean b=stream.noneMatch(s->s.length()>5);
		System.out.println(b);
		
		Stream<String>  names=Stream.generate(()->"Andy");
		System.out.println("@((@(@(@Waiting result from noneMatch");
		boolean c=names.noneMatch(s->s.length()>5);
		System.out.println(c);
	}
}


