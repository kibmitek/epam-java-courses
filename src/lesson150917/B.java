package lesson150917;

public class B {
	
	//1
	static{
		System.out.println("static init block. Runs only 1 time.");
	}
	
	//4
	public B(){
		System.out.println("constructor");
	}
	
	//3
	{
		System.out.println("logic init block");
	}
	
	//2
	static{
		System.out.println("static2 init block. Runs only 1 time.");
	}
}
