package java8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StreamDemo1 {

	public static void main(String[] args) {
		Customer customer1 = new Customer("Nagendra", "nagen@gmail.com", 20, "Fremont", 12, new Date(new Date().getTime()+191));
		Customer customer2 = new Customer("Raj", "raj@gmail.com", 23, "dallas", 78, new Date(new Date().getTime()+9));
		Customer customer3 = new Customer("Monika", "monika@gmail.com", 10, "here", 52, new Date(new Date().getTime()+244));
		Customer customer4 = new Customer("Nagendra", "nagen@gmail.com", 8, "Fremont", 12, new Date(new Date().getTime()+1434));
		Customer customer5 = new Customer("Monika", "monika@gmail.com", 15, "here", 82, new Date(new Date().getTime()+91));
		Customer customer6 = new Customer("Raj", "raj@gmail.com", 23, "dallas", 32, new Date(new Date().getTime()+199));
		Customer customer7 = new Customer("Opeoi", "opeoi@gmail.com", 34, "dallas", 56, new Date(new Date().getTime()+877));
		Customer customer8 = new Customer("Ashish", "opeoi@gmail.com", 554, "dallas", 4, new Date(new Date().getTime()+234));
		Customer customer9 = new Customer("devi", "devi@gamil.com",34, "philadelphia",7, new Date(new Date().getTime()+355));
		
		List<Customer> customers=new ArrayList<Customer>();
		customers.add(customer1);customers.add(customer2);customers.add(customer3);
		customers.add(customer4);customers.add(customer5);customers.add(customer6);
		customers.add(customer7);
		customers.add(customer8);customers.add(customer9);
		
		customers.stream()//Stream<Customer>
		.filter(c ->c.getName().startsWith("R")).forEach(System.out::println);
	}
}
