package lesson151005;

public class FinallyExamples {

	public static void main(String[] args) {
		
		System.out.println(getAge());
		try{
			System.out.println("one");
			throw new RuntimeException("stop");
		}
		finally{
			System.out.println("two");
		}
		
		
		
	}

	private static int getAge() {
		// TODO Auto-generated method stub
		
		try{
			return 20;
		}finally{
			return 30;
		}
		
	}
	
}
