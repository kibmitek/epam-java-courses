package lesson150922.inheritance.vs.composition;

public class C implements Changable{

	Changable changer;

	@Override
	public void change() {
		System.out.println("C");
		changer.change();
		
	}
	
	public void setChanger(Changable changer){
		this.changer = changer;
	}
	
}
