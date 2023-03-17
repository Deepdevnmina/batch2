@FunctionalInterface
interface Generator {
	public String create(String input);
}

public class StringPrefixCoolDemo {
	public static void main(String[] args) {
		magic(input ->"Mr. "+input);
	}
	
	private static void magic(Generator generator) {
		String res=generator.create("Nagendra");
		System.out.println(res);
	}
}
