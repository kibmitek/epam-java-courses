package homework150922_variant_13;

public class PlasticPack extends LoadablePack implements Loadable{
	
	protected PlasticPack(float volume, float price, AggregateStates state,
			CoffeeSorts sort) {
		super(volume, price, state, sort);
	}

	@Override
	public void load(Van van) {
		System.out.println("Loaded Plastic pack into the Van");
		van.loadPack(this);
	}
	
	@Override
	public String toString() {
		return
				"PlasticPack: " + "\n" +
				"volume: " + this.volume + ";\n" + 
				"price: " + this.price + ";\n" + 
				"aggregate state: " + this.state + ";\n" +
				"sort: " + this.sort + ".\n"
				;
				
	}
}
