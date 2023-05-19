package exQ;

import java.util.HashMap;
import java.util.Scanner;

public class Window10Main {
	/*
	 service 생성자에 각각의 값들 전송
	 1.성능(info)
	 2.기능사용
	   1) 계산기 2) 메모장 3)직접입력
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		HashMap<String, String> map = new HashMap<>();
		map.put("RAM", "16GB");
		map.put("시스템 종류", "64비트 운영체제");
		map.put("프로세서", "i7-7700");
		String calc = "calc";
		String notepad = "notepad";
		Window10Service ser = new Window10Service(calc,notepad,map);
		
		
		while(true) {
			System.out.println("1.성능(info)");
			System.out.println("2.기능사용");
			num = input.nextInt();
			switch(num) {
			case 1 : ser.info();
					 break;
			case 2 : System.out.println("1) 계산기 2) 메모장 3)직접입력");
					 num = input.nextInt();
					 ser.service(num);
					 break;
			}
		}
		
	}
}
