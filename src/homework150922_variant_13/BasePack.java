package homework150922_variant_13;

public class BasePack implements Loadable{
	float volume;
	float price;
	AggregateStates state;
	
	Loadable loader;
	
	@Override
	public void loadIntoVan() {
		loader.loadIntoVan();
	}
	
	public void setLoader(Loadable loader){
		this.loader = loader;
	}
}
