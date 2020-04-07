class State implements Habitable{
	public int population;
	public State(int pop){
		population=pop;
	}

	public int getPop(){
		return population;
	}
	public void incPop(int delta){
		population+=delta;
	}
	public void decPop(int delta){
		if(population-delta<0){
			System.out.println("Populaiton underflow");
			return;
		}
		population-=delta;
	}
	public void addHabitat(Habitable h){
		System.out.println("Cannot add a habitable here");
	}
}

