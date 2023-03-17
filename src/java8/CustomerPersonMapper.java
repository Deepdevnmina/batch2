package java8;

 public class CustomerPersonMapper {
	public static Person toPerson(Customer customer) {
		Person person=new Person();
		person.setName(customer.getName());
		person.setMarks(customer.getMarks());
		return person;
	}
}
