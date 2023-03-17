

class Mocha {
	public static int sum(int num1,int num2) {
		return num1+num2;
	}
}

interface Adder {
	public int add(int t1,int t2);
}

public class MathematicsDemo {
	public static void main(String[] args) {
		/*Adder adder=new Adder() {
			@Override
			public int add(int t1, int t2) {
				return t1+t2;
			}
		};*/
		/*Adder adder=(t1,t2) -> t1+t2;*/
		Adder adder=(t1,t2) -> Mocha.sum(t1,t2);
	}
}
