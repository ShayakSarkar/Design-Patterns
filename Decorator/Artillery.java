class Artillery extends SpecialOp{
	public Artillery(Warrior w){
		super(w);
	}

	public void fight(){
		warrior.fight();
		System.out.println("I fire shells at the enemy");
	}
	public int cost(){
		return warrior.cost()+200;
	}
	public void fire(){
		System.out.println("Kaboom !!");
	}
}

