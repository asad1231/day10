package exQ;

public class TempService {
	/*
	 연산을 담당한다.
	 온도를 올리고 내리는 연산
	 온도는 TempDTO에 있는 변수 활용
	 //private int temp=10;
	 */
	private TempDTO dto = new TempDTO();
	public void upTemp() {
		int a = dto.getTemp();
		a++;
		dto.setTemp(a);
	}
	public void downTemp() {
		int a = dto.getTemp();
		a--;
		dto.setTemp(a);
	}
	public void print() {
		System.out.println(dto.getTemp());
	}
	
}
