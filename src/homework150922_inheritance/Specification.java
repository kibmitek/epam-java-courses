package homework150922_inheritance;

public class Specification {

	static abstract class Printer{
		abstract void print();
	}
	
	static class LaserPrinter extends Printer{
		@Override
		void print() {
			System.out.println("Laser printing: baking toner with laser ray");
		}
	}

	static class JetPrinter extends Printer{
		@Override
		void print() {
			System.out.println("Jet printing: painting with ink from cartridge");
		}
	}
	
	public static void main(String[] args) {
		LaserPrinter lp = new LaserPrinter();
		lp.print();
		
		JetPrinter jp = new JetPrinter();
		jp.print();
	}
	
}
