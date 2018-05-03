
public class Gorilla extends Mammal {
	
	public Gorilla() {
		displayEnergy();
	}
	public void throwSomething() {
		setEnergy (-5);
		System.out.println("Energy Level dereased by 5");
	}
	public void eatBananas() {
		setEnergy (+10);
		System.out.println("Mimi the Gorilla is satisfied. Its energy increased by 10");
	}
	public void climb() {
		setEnergy (-10);
		System.out.println("Mimi has climbed a tree and it's tired. Its energy decreased by 10");
	}
	
}
