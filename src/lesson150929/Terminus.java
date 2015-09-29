package lesson150929;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

@Simple
public class Terminus {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("start typing");
		
		while(scanner.hasNextLine()){
			String line = scanner.nextLine();
			process(line);
		}
		scanner.close();
		System.out.println("finished");
	}
	
	private static void process(String line) {
//		switch(line){
//		case "left": left(); break;
//		case "right": right(); break;
//		case "sit": sit(); break;
//		case "stand": stand(); break;
//		default: System.out.println("unknown command");
//		}
		
//		Class<?> clazz = Terminus.class;
////		clazz.getAnnotations();
//		for (Annotation annotation : clazz.getAnnotations()) {
//			System.out.println(annotation);
//		}
		for (Method method : Terminus.class.getMethods()) {
			if(method.isAnnotationPresent(Command.class)){
				String anno = method.getAnnotation(Command.class).value();
				if(line.toUpperCase().contains(anno)){
					try {
						method.invoke(null, null);
						return;
					} catch (IllegalAccessException | IllegalArgumentException
							| InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}
		System.out.println("unknown command");
		
	}
	
	@Command("LEFT")
	public static void left(){
		System.out.println("moving left");
	}
	@Command("RIGHT")
	public static void right(){
		System.out.println("moving right");
	}
	@Command("SIT")
	public static void sit(){
		System.out.println("sat");
	}
	@Command("STAND")
	public static void stand(){
		System.out.println("stood");
	}
	
}
