package exQ;

import java.util.Scanner;

public class TempMain {
	public static void main(String[] args) {
		
		/*
		 보여지는 공간
		 1.온도올리기
		 2.온도내리기
		 3.현재 설정 정보
		 */
		Scanner input = new Scanner(System.in);
		TempService t = new TempService();
		int num;
		while(true) {
			System.out.println("1.온도올리기");
			System.out.println("2.온도내리기");
			System.out.println("3.현재 설정 정보");
			num = input.nextInt();
			switch(num) {
			case 1 : t.upTemp();
					 break;
			case 2 : t.downTemp();
					 break;
			case 3 : t.print();
					 break;
			}
			
		}
		
		
	}
}
