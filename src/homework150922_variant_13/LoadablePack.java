package homework150922_variant_13;

public class LoadablePack implements Loadable{
	float volume;
	float price;
	AggregateStates state;
	CoffeeSorts sort;
	
	Loadable loader;
	
	@Override
	public void loadIntoVan() {
//		if(this.volume > )
//			System.out.println("This pack is bigger than free Van's volume");
		loader.loadIntoVan();
	}
	
	public void setLoader(Loadable loader){
		this.loader = loader;
	}
	
	public float getVolume(){
		return this.volume;
	}
}
