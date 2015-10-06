package lesson151006;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class YaRuGet {

	public static void main(String[] args) {
		try {
			try(Socket socket = new Socket("ya.ru", 80)){ //AutoClosable
				OutputStream outputStream = socket.getOutputStream();
				PrintWriter pw = new PrintWriter(outputStream);
				pw.println("GET / HTTP/1.0" + "\n");
				pw.flush();
				
				InputStream inputStream = socket.getInputStream();
				Scanner scanner = new Scanner(inputStream);
				
				while(scanner.hasNextLine()){
					System.out.println(scanner.nextLine());
				}
				
			}// = telnet ya.ru 80
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//
	}
	
}
