class ArtilleryBar extends Barrack{
	public Soldier createSoldier(int id){
		Soldier a=new Artillery(id);
		return a;
	}
}
