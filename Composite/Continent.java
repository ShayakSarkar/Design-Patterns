import java.util.LinkedList;
class Continent implements Habitable{
	public LinkedList<Habitable> countries;
	public int population;
	public Continent(){
		countries=new LinkedList<Habitable>();
		population=0;
	}
	public int getPop(){
		for(Habitable it:countries){
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
		countries.add(h);
	}

}

