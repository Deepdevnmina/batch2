import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		 printa( t ->System.out.println("Hello Mr ... "+t));
	}
	
	public static void printa(Consumer<String> tttt) {
		tttt.accept("Nagendra");
	}

}
