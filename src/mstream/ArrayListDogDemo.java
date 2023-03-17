package mstream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayListDogDemo {

	public static void main(String[] args) {
		 
		
		 List<Dog> dogs=new ArrayList<Dog>();
		 
		 Dog d1=new Dog("Mocha", "Red", 100);
		 Dog d2=new Dog("Jacks", "White", 90);
		 Dog d3=new Dog("Pops", "Black", 80);
		 Dog d4=new Dog("Moto", "Green", 500);
		 Dog d5=new Dog("Facks", "White", 200);
		 Dog d6=new Dog("Tommy", "Purple", 300);
		 Dog d7=new Dog("Rocket", "Magneta", 90);
		 
		 dogs.add(d1);
		 dogs.add(d2);
		 dogs.add(d3);
		 dogs.add(d4);
		 dogs.add(d5);
		 dogs.add(d6);
		 dogs.add(d7);
		 System.out.println("@)@)(@(@(Enhance for loop");
		 for(Dog d:dogs) {
			 //toString - give dogs information into string representation
			 System.out.println(d);
		 }
		 
		 Map<String,Dog> maps =dogs.stream().collect(Collectors.toMap(Dog::getName,Function.identity()));
		 System.out.println(maps);
		 Dog dodod=maps.get("Tommy");
		 System.out.println(dodod);
		 
	}
}
