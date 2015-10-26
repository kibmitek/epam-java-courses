package homework150922_inheritance;

abstract class Specialization {

	static class Human{
		
		public void live(){
			System.out.println("I'm a  human. I am alive.");
		}
	}
	
	static class Men extends Human{
		Meat meat;
		
		@Override
		public void live() {
			super.live();
			System.out.println("My life goal is to hunt and to bring meat.");
			Meat meat = hunt();
			bring(meat);
		}
		
		private void bring(Meat meat) {
			this.meat = meat;
		}

		public Meat hunt(){
			System.out.println("Men is hunting.");
			Meat meat = new Meat("Deer",300);
			return meat;
		}
	}
	
	static class Woman extends Human{
		Meat meat;
		Food food;
		
		@Override
		public void live(){
			super.live();
			System.out.println("My life goal is to cook and to feed a men.");
			this.food = cook(this.meat);
			System.out.println("Woman feed men with food type: " + food.type + " and food weight: " + food.weight);
			
		}
		
		public Food cook(Meat meat){
			System.out.println("Woman is cooking");
			Food food = new Food(meat.type, meat.weight/2);
			return food;
		}
	}
	
	static class Meat{
		String type;
		int weight;
		public Meat(String type, int weight){
			this.type = type;
			this.weight = weight;
		}
	}
	static class Food{
		String type;
		int weight;
		public Food(String type, int weight){
			this.type = type;
			this.weight = weight;
		}
		
	}

	public static void main(String[] args) {
		Men men = new Men();
		Woman woman = new Woman();
		men.live();
		woman.meat = men.meat;
		men.meat = null;
		woman.live();
	}

	
}
