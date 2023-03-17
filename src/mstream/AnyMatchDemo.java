package mstream;

import java.util.stream.Stream;

public class AnyMatchDemo {
	public static void main(String[] args) {
		Stream<String>  stream=Stream.of("Nagendra","James","Aaron","Jack");
		boolean b=stream.anyMatch((s)->s.length()>5);
		System.out.println(b);
		
		Stream<String>  names=Stream.generate(()->"Andy");
		System.out.println(")@)@Working with anymatch@@");
		boolean c=names.anyMatch(s->s.length()>5);
		System.out.println(c);
	}
}


