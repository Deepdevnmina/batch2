import java.util.function.Consumer;

public class EaterDemo2 {
	public static void main(String[] args) {
		 /*Consumer<String>  ccc=new Consumer<String>() {
			 @Override
			public void accept(String t) {
				 System.out.println("Hello Mr. "+t);
			}
		};
			*/
/*		Consumer<String>  ccc=(String t) -> {
				 System.out.println("Hello Mr. "+t);
			};
*/
		
		/*Consumer<String>  ccc=(t) -> {
			 System.out.println("Hello Mr. "+t);
		};*/
		/*Consumer<String>  ccc=t -> {
			 System.out.println("Hello Mr. "+t);
		};*/
		
		Consumer<String>  ccc=(t) -> System.out.println("Hello Mr. "+t);
		ccc.accept("Nagendra");
		
	}
}
