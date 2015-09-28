package homework150922_variant_13;

public class PlasticPack extends BasePack implements Loadable{
	
	public PlasticPack(AggregateStates state, float volume, float price) {
		
	}
	
	@Override
	public void loadIntoVan() {
		System.out.println("Plastic pack was loaded into the Van");
	}
}
