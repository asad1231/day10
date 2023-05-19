package time_ex;

import java.io.IOException;

public class MainClass03 {
	public static void main(String[] args) {
		ProcessBuilder pro = new ProcessBuilder();
		pro.command("mspaint");
		
		try {
			pro.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
