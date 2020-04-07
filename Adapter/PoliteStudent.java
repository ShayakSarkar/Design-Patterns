class PoliteStudent implements IPoliteStudent{
	public Teacher teacher;
	public PoliteStudent(Teacher t){
		teacher=t;
	}
	public void rudeFeed(String feedback){
		System.out.println("Actual message: "+feedback);
		String touchOfPoliteness="Excuse Me Sir ... ";
		teacher.getFeedback(touchOfPoliteness,feedback);		
	}
}
