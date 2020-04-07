class Cavalry extends SpecialOp{
	public Cavalry(Warrior w){
		super(w);
	}	
	public void fight(){
		warrior.fight();
		System.out.println("I fight on horseback too");
	}
	public int cost(){
		return warrior.cost()+100;
	} 
	public void ride(){
		System.out.println("I am riding a horse now");
	}
}
