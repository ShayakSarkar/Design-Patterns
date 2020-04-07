class Cavalry extends WarriorPreparation{
	public Cavalry(String name){
		this.name=name;
	}
	public void train(){
		System.out.println("I am going to train on a horseback");
		System.out.println("I am going to train with my spear");
	}
	public void gotoBattlefield(){
		System.out.println("I goto battlefield on horse back");
	}
	public void fight(){
		System.out.println("I fight with my spear on horseback");
	}
	public void returnHome(){
		System.out.println("I return home on horseback");
	}
}
