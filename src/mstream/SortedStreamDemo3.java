package mstream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
	private String name;
	private String email;
	private int age;
	

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public Employee(String name, String email, int age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", age=" + age + "]";
	}

}

public class SortedStreamDemo3 {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Nagendra", "nagen@gmail.com",38),
				new Employee("Jhon","a@gmail.com",30),
				new Employee("Ramesh","ramesh@gmail.com",20),
				new Employee("Ramesh","ramesh@gmail.com",30),
				new Employee("Mocha","mocha@gmail.com",45));
		
		list.stream().//Stream<EMployee>
		sorted((s1,s2)->{
			  int p=s1.getEmail().compareTo(s2.getEmail());
			  if(p==0) {
				  p=s2.getAge()-s1.getAge();
			  }
			  return p;
			})////Stream<EMployee>
		.forEach(System.out::println); //
		
		/*list.stream().sorted(Comparator.comparing(Employee::getName).reversed().
				thenComparing(Employee::getAge)).forEach(System.out::println);*/
		
	}
}
