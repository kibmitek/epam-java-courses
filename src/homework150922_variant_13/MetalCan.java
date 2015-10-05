package homework150922_variant_13;

public class MetalCan extends LoadablePack implements Loadable {
	
	protected MetalCan(float volume, float price, AggregateStates state,
			CoffeeSorts sort) {
		super(volume, price, state, sort);
		
	}

	@Override
	public void load(Van van) {
		System.out.println("Metal can was loaded into the Van");
		van.loadPack(this);
	}
	
	@Override
	public String toString() {
		return
				"MetalCan: " + "\n" +
				"volume: " + this.volume + ";\n" + 
				"price: " + this.price + ";\n" + 
				"aggregate state: " + this.state + ";\n" +
				"sort: " + this.sort + ".\n"
				;
				
	}
}
