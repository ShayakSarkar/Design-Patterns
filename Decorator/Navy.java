class Navy extends SpecialOp{
	public Navy(Warrior w){
		super(w);
	}
	public void fight(){
		warrior.fight();
		System.out.println("Firing ship cannons is my expertise");
	}
	public int cost(){
		return warrior.cost()+300;
	}
	public void sail(){
		System.out.println("Aye Aye Capitan !!");
	}
}

