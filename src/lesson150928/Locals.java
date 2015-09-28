package lesson150928;

public class Locals {

	static class Task implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Yo!");
		}
		
	}
	
	public static Runnable createTask(){//Anonymous class. Can not create several instances.
		return new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hi there");
			}
			
		};
	}
	
	public static Runnable[] tasks(){
		class MyTask implements Runnable{
			private final String message;
			public MyTask(String message){
				this.message = message;
				
			}
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(message);
			}
		}
		
		Runnable[] myTasks = {new MyTask("first"),new MyTask("second"),new MyTask("last")};
//		myTasks[0] = new Runnable(){
//
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("first");
//			}
//			
//		};
//		myTasks[1] = new Runnable(){
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("second");
//			}
//			
//		};
//		myTasks[2] = new Runnable(){
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("last");
//			}
//			
//		};
		return myTasks;
				
	}
	
	public static void main(String[] args) {
		createTask().run();
		new Task().run();
	}
}
