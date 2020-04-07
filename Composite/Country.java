import java.util.LinkedList;
class Country implements Habitable{
	public int population;
	LinkedList<Habitable> states;
	public Country(){
		states=new LinkedList<Habitable>();
		population=0;
	}
	public int getPop(){
		for(Habitable it:states){
			population+=it.getPop();
		}
		return population;
	}
	public void incPop(int delta){
		System.out.println("Increase population at the state");
	}
	public void decPop(int delta){
		System.out.println("Decrease population at the state");
	}
	public void addHabitat(Habitable h){
		states.add(h);
	}
}

