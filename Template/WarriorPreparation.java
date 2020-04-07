abstract class WarriorPreparation{
	public String name;
	public final void prepare(){
		System.out.println("\n"+name+"'s preparation\n===================================\n");
		wakeup();
		train();
		wearArmour();
		gotoBattlefield();
		fight();
		returnHome();
	}
	public final void wakeup(){
		System.out.println("Wake up from sleep .... yawwwwwnnnn");
	}
	public final void wearArmour(){
		System.out.println("I wear helmet, body armour etc");
	}
	public abstract void train();
	public abstract void gotoBattlefield();
	public abstract void fight();
	public abstract void returnHome();
}

