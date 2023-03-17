
interface Summer {
	public int sum(int num1,int num2);
}



public class SummerMain {
	public static void main(String[] args) {
		Summer summer=new Summer() {
			@Override
			public int sum(int num1, int num2) {
				return num1+num2;
			}
		};
		int result=compute(summer,19,23);
		System.out.println(result);
	}
	
	public static int compute(Summer summer,int num1,int num2) {
		return summer.sum(num1, num2);
	}
}
