package batch2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarStreamPartitionBy {

	public static void main(String[] args) {
		///This is data on which we have to operate
		List<Car> cars=new ArrayList<>();
		Car car1=new Car(1,"red",129,"nagen@gmail.com",2018);
		Car car2=new Car(2,"red",800,"rag@gmail.com",2012);
		Car car3=new Car(3,"white",845,"maks@gmail.com",2010);
		Car car4=new Car(4,"silver",624,"jacks@gmail.com",2019);
		Car car5=new Car(5,"blue",465,"nagen@gmail.com",2020);
		Car car6=new Car(6,"white",534,"mk@gmail.com",2016);
		Car car7=new Car(7,"yellow",246,"omega@gmail.com",2015);
		Car car8=new Car(8,"red",435,"james@gmail.com",2018);
		cars.add(car1);cars.add(car2);cars.add(car3);cars.add(car4);
		cars.add(car5);cars.add(car6);cars.add(car7);cars.add(car8);

		Map<Boolean,List<Car>> carsMapping =cars.stream().//Stream<Car>
		                                 collect(Collectors.partitioningBy((ropesh)->ropesh.getPrice()>500)); //Set<Car>
		
		carsMapping.forEach((key,value) ->{
			  System.out.println("Car with color = "+key);
			  for(Car c:value)  {
				  System.out.println(c);
			  }
			  System.out.println("_______________________________");
		});
		
	}
}
