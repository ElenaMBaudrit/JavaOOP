
public class Mammal {
	private int energyLevel;
	private int dragonEnergyLevel;
	
	public Mammal(){
		energyLevel = 100;
		dragonEnergyLevel = 300;
	}
	
	public void displayEnergy() {
		System.out.println("Energy level starts at: " + energyLevel);
		System.out.println("Lizzy the Dragon'e energy level is at: "+ dragonEnergyLevel);
	}
	public int setEnergy(int enVal) {
		energyLevel += enVal;
		return energyLevel;
	}
}
