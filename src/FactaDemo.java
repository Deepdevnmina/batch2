
interface Facta{
	public int compute(int num);
}

public class FactaDemo {

	public static void main(String[] args) {
		/*Facta facta=new Facta() {
			@Override
			public int compute(int num) {
				return num*num*num;
			}
		};*/
		
		/*Facta facta=(int num) -> {
				return num*num*num;
			};*/
	
		/*Facta facta=(int num) -> num*num*num;*/
		
		/*Facta facta=(num) -> num*num*num;*/
		Facta facta=num->num*num*num;
		int result=facta.compute(8);
		System.out.println("result is  = "+result);
		
	}
}
