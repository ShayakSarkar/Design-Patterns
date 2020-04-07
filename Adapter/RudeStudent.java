class RudeStudent{
	public IPoliteStudent adapter;
	public RudeStudent(Teacher t){
		adapter=new PoliteStudent(t);
	}

}
