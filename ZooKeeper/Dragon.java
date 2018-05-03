public class Dragon extends Mammal {
	
	public Dragon() {
		displayEnergy();
	}
	public void fly() {
		setEnergy (-50);
		System.out.println("Lizzy's energy just decreased by 50");
	}
	public void eatHumans() {
		setEnergy (+25);
		System.out.println("Lizzy ate a hum... Nevermind, her energy increased by 25");
	}
	public void attackTown() {
		setEnergy (-100);
		System.out.println("Lizzy just roasted a small town and her energy decreased by 100");
	}
}


