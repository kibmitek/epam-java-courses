package homework150922_variant_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Van{
	private final int MAX_VOLUME;
	float freeVolume; // volume of the van
	float totalSum; //cost of all goods in the van
	List<Loadable> packagesList;
	
	private Van(int maxVolume){
		MAX_VOLUME = maxVolume;
	}
	
	public static Van createVan(int maxVolume){
		Van van = new Van(maxVolume);
		van.freeVolume = maxVolume;
		van.totalSum = 0;
//		van.packagesList = new List<Loadable>; //ERROR, why?
		return van;
		
	}
	
	public Van loadPack(Loadable pack){
		if(this.freeVolume < pack.getVolume()){
			System.out.println("Not enough free space in the Van");
			return this;
		}
		packagesList.add(pack);
		return this;
	}
	
	@Override
	public String toString() {
		return "Van: " + "\n" + 
		"maxVolume = " + MAX_VOLUME + "\n" +
		"freeVolume = " + this.freeVolume + "\n" +
		"totalSum = " + this.totalSum + "\n" +
		"list of goods: "+ "\n" +
		this.packagesList;
	
	}
	
	
}
