package time_ex;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("시작");
		long start = System.currentTimeMillis();
		System.out.println(start);
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("끝");
		System.out.println((end - start) / 1000);
		
	}
}
