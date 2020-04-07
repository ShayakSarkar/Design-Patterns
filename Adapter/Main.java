public class Main{
	public static void main(String args[]){
		Teacher t=new Teacher();
		RudeStudent rs=new RudeStudent(t);
		rs.adapter.rudeFeed("I dont like your teaching");
	}
}
