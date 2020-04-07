class Artillery extends WarriorPreparation{
	public Artillery(String name){
		this.name=name;
	}
	public void train(){
		System.out.println("I train with cannons and guns");
	}
	public void gotoBattlefield(){
		System.out.println("I go to battlefield riding on my cannon ... hahahaha");
	}
	public void fight(){
		System.out.println("I fight with guns and cannons ... I fire with accuracy");
	}
	public void returnHome(){
		System.out.println("I return home riding on my cannon");
	}
}

