package exQ;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Window10Service {
	private Window10DTO dto = new Window10DTO();
	public Window10Service(String calc, String notepad, HashMap<String, String> map) {
		dto.setCalc(calc);
		dto.setNotepad(notepad);
		dto.setMap(map);
	}
	public void info() {
		System.out.println(dto.getMap());
	}
	public void service(int num){
		Scanner input = new Scanner(System.in);
		ProcessBuilder pro = new ProcessBuilder();
		if(num == 1) {
			pro.command(dto.getCalc());
		}else if(num == 2) {
			pro.command(dto.getNotepad());
		}else if(num == 3) {
			System.out.print("입력 : ");
			String n = input.next();
			dto.setMsg(n);
			pro.command(dto.getMsg());
		}
		try {
			pro.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
