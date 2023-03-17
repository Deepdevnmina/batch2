

interface Runner {
	public void foo();
	public void zee();
}


public class AnymousClass {
	 public static void main(String[] args) {
		 Runner run=new Runner() {
			public void zee() {
				System.out.println("I am zee");
			}
			public void foo() {
				System.out.println("I am foo");
			}
		}; 
		run.foo();
		run.zee();
	}	
}
