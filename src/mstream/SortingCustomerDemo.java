package mstream;

import java.util.stream.Stream;

//POJO - Plain Old Java Object
//POJI -Plain Old Java Interface
class JCustomer implements Comparable<JCustomer>{
	private String name;
	private String email;
	private int age;
	
	public JCustomer(String name,String email,int age) {
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
		return "JCustomer [name=" + name + ", email=" + email + ", age=" + age + "]";
	}


	@Override
	public int compareTo(JCustomer o) {
		return o.age-this.age;//descending order as per age
	}
	
}

public class SortingCustomerDemo {

	public static void main(String[] args) {
		Stream<JCustomer> customers=Stream.of(
				new JCustomer("Rock", "rock@gmail.com", 12),
				new JCustomer("Joke", "joke@gmail.com", 32),
				new JCustomer("Lubo", "luibo@gmail.com", 20),
				new JCustomer("Maks", "maks@gmail.com", 12),
				new JCustomer("Jack", "jack@gmail.com", 20));
		//customers.sorted().forEach((JCustomer c)-> System.out.println(c));
		//(Customer c1,Customer)
		customers.sorted().forEach(System.out::println);
		//customers.sorted((c1,c2)->c1.getName().compareTo(c2.getName())).forEach(System.out::println);
		
	}
}
