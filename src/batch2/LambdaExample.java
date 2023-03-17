package batch2;

import java.util.Scanner;

//This annotation ensures we cannot 
//declare more than one abstract method
//this annotation only works at compile
@FunctionalInterface 
interface Vehicle<T> {
	public void eat(T t);
}
//what about other interfaces which have more than one method?
//for those lambda says . I am sorry
public class LambdaExample { 
	     public static void main(String[] args) {
	    	 
	    	 //Hey I am making an instance of a class which does not have any name
	    	 //but implementing functional interface , anonymous class exist on the fly
	    	 //only  and you can use it only once...
	    	/* Vehicle<String>  pk =new  Vehicle<String>() { 
				    		 @Override
				    		public void eat(String t) {
				    			System.out.println("Hello I want to eat  =  "+t);
				    		}
			};*/
	    	 
	    	/* Vehicle<String>  pk =(String t) -> {
	    			System.out.println("Hello I want to eat  =  "+t);
	    		};*/
	    	 
//	    	 Vehicle<String>  pk =(t) -> {
//	    			System.out.println("Hello I want to eat  =  "+t);
//	    		};
	    	 
	    	 /*Vehicle<String>  pk =t -> {
	    			System.out.println("Hello I want to eat  =  "+t);
	    		};
	    	*/
	    	 
	    	 Scanner scanner=new Scanner(System.in);
	    	 System.out.println("Enter your food please");
	    	 String food=scanner.next();
	    	 Vehicle<String>  pk =t -> System.out.println("Hello I want to eat  =  "+t);
	    	 pk.eat(food);
	    	 
		}

}
