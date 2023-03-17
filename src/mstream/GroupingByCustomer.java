package mstream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//POJO - Plain Old Java Object
//POJI -Plain Old Java Interface
class Customer {
	private String name;
	private String email;
	private int age;
	
	public Customer(String name,String email,int age) {
		this.name=name;
		this.email=email;
		this.age=age;
	}
	
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", age=" + age + "]";
	}
	
}

public class GroupingByCustomer {

	public static void main(String[] args) {
		Stream<Customer> customers=Stream.of(
				new Customer("Rock", "rock@gmail.com", 12),
				new Customer("Joke", "joke@gmail.com", 32),
				new Customer("Lubo", "luibo@gmail.com", 20),
				new Customer("Maks", "maks@gmail.com", 12),
				new Customer("Jack", "jack@gmail.com", 20));
		//Map<Integer,List<Customer>> customerGroups=customers.collect(Collectors.groupingBy((Customer t)->t.getAge()));
		Map<Integer,List<Customer>> customerGroups=customers.collect(Collectors.groupingBy(Customer::getAge));
		System.out.println(customerGroups);
		
		//BiConsumer
		customerGroups.forEach((age,list) ->{
			System.out.println(age+""+list);
			System.out.println("list - "+list);
			System.out.println("*************************************");
		});
		
	}
}
