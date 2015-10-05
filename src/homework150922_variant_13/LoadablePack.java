package homework150922_variant_13;

public class LoadablePack implements Loadable{
	float volume;
	float price;
	AggregateStates state;
	CoffeeSorts sort;
	
	protected LoadablePack(float volume, float price, AggregateStates state,CoffeeSorts sort){
		this.volume = volume;
		this.price = price;
		this.state = state;
		this.sort = sort;
	}
	
	Loadable loader;
	
	@Override
	public void load(Van van) {
		if(this.volume > van.freeVolume)
			System.out.println("This pack is bigger than free Van's volume");
		loader.load(van);
		
	}
	
//	public void setLoader(Loadable loader){
//		this.loader = loader;
//	}
	
	public float getVolume(){
		return this.volume;
	}
	
	public float getPrice(){
		return this.price;
	}
}
