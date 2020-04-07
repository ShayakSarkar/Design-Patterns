interface Habitable{
	public abstract int getPop();
	public abstract void incPop(int delta);	
	public abstract void decPop(int delta);
	public abstract void addHabitat(Habitable h);
}
