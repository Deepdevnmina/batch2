
interface Math {
	public int fact(int num);
}


public class FunctionalDemoe {
	public static void main(String[] args) {
		
		//Lambda function = it is short form of Anonymous class which functional interface
	/*	Math math =(int num) -> {
				int sum=1;
				for(int x=2;x<=num;x++) {
					sum=sum*x;
				}
				return sum;
			};*/
		/*Math math =(num) -> {
			int sum=1;
			for(int x=2;x<=num;x++) {
				sum=sum*x;
			}
			return sum;
		};*/
		Math math =num -> {
			int sum=1;
			for(int x=2;x<=num;x++) {
				sum=sum*x;
			}
			return sum;
		};
		
	/*	Runnable runnable=() -> {
				 System.out.println("Hello I am good!!!!");
			};*/
	}
}
