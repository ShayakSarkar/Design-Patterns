import java.util.LinkedList;
class Electromeda implements Habitable{
	public LinkedList<Habitable> continents;
	public int population;
	public Electromeda(){
		continents=new LinkedList<Habitable>();
		population=0;
	}
	public int getPop(){
		for(Habitable  it:continents)
			population+=it.getPop();
		return population;
	}
	public void decPop(int delta){
		System.out.println("Decrease population at the state .. not here");
	}
	public void incPop(int delta){
		System.out.println("Increase population at the state .. not here");
	}
	public void addHabitat(Habitable h){
		continents.add(h);
	}
}

