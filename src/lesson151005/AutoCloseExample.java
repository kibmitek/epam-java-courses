package lesson151005;

import java.util.Scanner;

public class AutoCloseExample {

//	public static void main(String[] args) {
//		
//		Scanner s = new Scanner(System.in);
//		try{
//		while(s.hasNextLine()){
//			System.out.println(s.nextLine());
//		}
//		}finally{
//			s.close();
//		}
//	}
	
	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in)){
		while(s.hasNextLine()){
			System.out.println(s.nextLine());
		}
		
	}
	
}
}