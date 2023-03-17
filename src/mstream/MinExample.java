package mstream;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

//What is difference between Comparable and Comparator
public class MinExample {
	public static void main(String[] args) {
		
		Runnable task=() ->System.out.println("@(@(@(@(@(@(");
		
		//This is Lambda expression for the comparator
		Comparator<String> cs= (o1,o2)->o1.length()-o2.length();
		Stream<String> s=Stream.of("monkey","gorilla","bonob");
		//Comparator<String>  comp=(s1,s2)-> return int
		//min, max , sort
		Optional<String> optional=s.min((s1,s2)->s1.length()-s2.length());//Comparator
		if(optional.isPresent()) {
			String sss=optional.get();
		}else {
			
		}
		/*optional.ifPresent(t->System.out.println(t));*/
		optional.ifPresent(System.out::println); // reference to non static method for instance

		optional.ifPresent(System.out::println);
		optional.ifPresentOrElse(System.out::println, () ->System.out.println("Nahi hai"));
	}
}
