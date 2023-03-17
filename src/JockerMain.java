interface Jocker{
	public abstract void dance();
}

public class JockerMain {
     public static void main(String[] args) {
	    /*	Jocker jock=new Jocker() {
			public void dance() {
				System.out.println(")@(#*Hey I am dancing#*");
			}
		};
		
		jock.dance();*/
    	 //Lambda expression
    	/* Jocker jock=() -> {
 				System.out.println(")@(#*Hey I am dancing#*");
 			};*/
    	 
    	 Jocker jock=() ->System.out.println(")@(#*Hey I am dancing#*");
    	 jock.dance();
    	 
	}	
}
