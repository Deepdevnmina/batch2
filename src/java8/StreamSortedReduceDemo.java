package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class StreamSortedReduceDemo {

	public static void main(String[] args) {
		Customer customer1 = new Customer("Nagendra", "nagen@gmail.com", 20, "Fremont", 12,
				new Date(new Date().getTime() + 191));
		Customer customer2 = new Customer("Raj", "raj@gmail.com", 23, "dallas", 78, new Date(new Date().getTime() + 9));
		Customer customer3 = new Customer("Monika", "monika@gmail.com", 10, "here", 52,
				new Date(new Date().getTime() + 244));
		Customer customer4 = new Customer("Nagendra", "nagen@gmail.com", 8, "Fremont", 12,
				new Date(new Date().getTime() + 1434));
		Customer customer5 = new Customer("Monika", "monika@gmail.com", 15, "here", 82,
				new Date(new Date().getTime() + 91));
		Customer customer6 = new Customer("Raj", "raj@gmail.com", 23, "dallas", 32,
				new Date(new Date().getTime() + 199));
		Customer customer7 = new Customer("Opeoi", "opeoi@gmail.com", 34, "dallas", 56,
				new Date(new Date().getTime() + 877));
		Customer customer8 = new Customer("Ashish", "opeoi@gmail.com", 554, "dallas", 4,
				new Date(new Date().getTime() + 234));

		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		customers.add(customer6);
		customers.add(customer7);
		customers.add(customer8);

		// p1 , p2 , p3 ,p4
		/* Optional<Person> optional=customers.stream() // Stream<Customer>
				.map(CustomerPersonMapper::toPerson) // Stream<Person>
				.sorted(Comparator.comparing(Person::getMarks).thenComparing(Person::getName).reversed()).reduce((s1,s2)->{
					String temp=s1.getName()+" - "+s2.getName();
					s1.setName(temp);
					return s1;
				});
		 
		 optional.ifPresent(System.out::println);*/
		
		customers.stream() // Stream<Customer>
		.map(CustomerPersonMapper::toPerson) // Stream<Person>
		.sorted(Comparator.comparing(Person::getMarks).thenComparing(Person::getName).reversed()).reduce((s1,s2)->{
			String temp=s1.getName()+" - "+s2.getName();
			s1.setName(temp);
			return s1;
		}) .ifPresent(System.out::println);

	}
}
