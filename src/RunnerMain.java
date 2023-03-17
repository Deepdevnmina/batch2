

public class RunnerMain {

	public static void main(String[] args) {
		Runnable  tt =new Runnable() {
			@Override
			public void run() {
				for(int x=0;x<100;x++) {
					System.out.println("e9e92828282");
				}
			}
		};
		Thread t=new Thread(tt);
		t.start();
	}
}
