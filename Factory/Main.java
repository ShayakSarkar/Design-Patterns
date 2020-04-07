public class Main{
	public static void main(String args[]){
		Barrack cb=new CavalryBar();
		Barrack ab=new ArtilleryBar();
		Barrack nb=new NavyBar();

		Soldier c,n,a;
		c=cb.createSoldier(1);
		a=ab.createSoldier(2);
		n=nb.createSoldier(3);

		c.fight();
		a.fight();
		n.fight();
	}

}

