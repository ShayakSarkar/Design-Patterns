class CavalryBar extends Barrack{
	public Soldier createSoldier(int id){
		Soldier c=new Cavalry(id);
		return c;
	}
}
