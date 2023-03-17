

interface Eater<T> {   //T means any data type
	public void eat(T  t);
}


public class EaterDemo {
	public static void main(String[] args) {
		/* Eater<String>  t =new Eater<String>() {
			 @Override
			public void eat(String t) {
				System.out.println("Hello Mr. "+t);
			}
		};*/
		
		/* Eater<String>  eater =(String t) -> {
				System.out.println("Hello Mr. "+t);
			};*/
		
		 /*Eater<String>  eater = t -> {
				System.out.println("Hello Mr. "+t);
			};*/
		
		Eater<String>  eater = t ->System.out.println("Hello Mr. "+t);
		eater.eat("Nagenda");
			
	}
}
