package batch2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CarSortingStream {

	public static void main(String[] args) {
		///This is data on which we have to operate
		List<Car> cars=new ArrayList<>();
		Car car1=new Car(1,"red",129,"nagen@gmail.com",2018);
		Car car2=new Car(2,"red",246,"rag@gmail.com",2012);
		Car car3=new Car(3,"white",845,"maks@gmail.com",2010);
		Car car4=new Car(4,"siler",246,"rag@gmail.com",2019);
		Car car5=new Car(5,"blue",465,"nagen@gmail.com",2020); //Map<Car,List<Integer>>
		Car car6=new Car(6,"white",243,"mk@gmail.com",2016);
		Car car7=new Car(7,"yellow",246,"omega@gmail.com",2015);
		Car car8=new Car(8,"green",435,"maks@gmail.com",2018);
		cars.add(car1);cars.add(car2);cars.add(car3);cars.add(car4);
		cars.add(car5);cars.add(car6);cars.add(car7);cars.add(car8);
	
		
		System.out.println("Another syntax");
		Map<Car,List<Integer>> mapcars=cars.stream().//Stream<Car>
		sorted(Comparator.comparing(Car::getPrice).thenComparing(Car::getModel).reversed()). //Sorted Stream<Car>
		collect(Collectors.groupingBy(Function.identity(),Collectors.mapping(Car::getPrice, Collectors.toList())));
		
		mapcars.forEach((key,value) ->{
			  System.out.println("Car with color = "+key);
			  System.out.println(value);
			  System.out.println("_______________________________");
		});
		
	}
}
