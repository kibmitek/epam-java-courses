package homework150922_variant_13;

public class UseVan {
	public static void main(String[] args) {
		Van van = Van.createVan(2000);
		System.out.println(van);
		MetalCan coffeeNescafe = new MetalCan(0.001f, 329.10f, AggregateStates.SUBLIMATED, CoffeeSorts.MIXED);
		MetalCan coffeePele = new MetalCan(0.001f, 329.10f, AggregateStates.SUBLIMATED, CoffeeSorts.MIXED);
		
		PlasticPack coffeeLavazza = new PlasticPack(0.003f, 2000f, AggregateStates.BEANS, CoffeeSorts.ARABICA);
		PlasticPack coffeeCuattro = new PlasticPack(0.003f, 2000f, AggregateStates.BEANS, CoffeeSorts.ARABICA);
		
		Loadable[] packs = {coffeeNescafe, coffeePele, coffeeLavazza, coffeeCuattro};
		load(packs, van);
		
		System.out.println(van);
		
	}
	private static void load(Loadable[] things, Van van) {
		for (Loadable loadable : things) {
			loadable.load(van);
		}
	}
}
