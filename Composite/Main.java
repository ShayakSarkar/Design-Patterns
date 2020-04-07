public class Main{
	public static void main(String args[]){
		Habitable e=new Electromeda();
		
		Habitable cont1=new Continent();
		Habitable cont2=new Continent();
		e.addHabitat(cont1);
		e.addHabitat(cont2);

		Habitable country1=new Country();
		Habitable country2=new Country(); 
		cont1.addHabitat(country1);
		cont1.addHabitat(country2);

		Habitable country3=new Country();
		Habitable country4=new Country();
		cont2.addHabitat(country3);
		cont2.addHabitat(country4);

		Habitable state1=new State(100);
		Habitable state2=new State(100);
		country1.addHabitat(state1);
		country1.addHabitat(state2);

		Habitable state3=new State(200);
		Habitable state4=new State(200);
		country2.addHabitat(state3);
		country2.addHabitat(state4);

		Habitable state5=new State(300);
		Habitable state6=new State(300);
		country3.addHabitat(state5);
		country3.addHabitat(state6);

		Habitable state7=new State(400);
		Habitable state8=new State(400);
		country4.addHabitat(state7);
		country4.addHabitat(state8);

		System.out.println(e.getPop());
	}
}
