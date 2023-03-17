
interface Square {
	public int sq(int num);
}


public class SquareDemo {
	public static void main(String[] args) {
		/*Square sd =new Square() {
			@Override
			public int sq(int num) {
				return num*num;
			}
		}
		*/
		/*Square sd =(int num) -> {
				return num*num;
			};*/
			
		/*	Square sd =(num) -> {
				return num*num;
			};*/
		
/*		Square sd =num -> {
			return num*num;
		};*/
		Square sd =(num) -> num*num; //Lambda function
		
		int palm=magic(sd,6);
		
		System.out.println(palm);
	}
	
	public static int magic(Square sd,int num) {
		int result=sd.sq(num);
		return result;
	}
	
}
