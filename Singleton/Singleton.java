public class Singleton{
	private String s;
	private static Singleton instance=null;
	private Singleton(String s){
		this.s=s;
		instance=this;
	}
	public static Singleton getInstance(String s){
		if(instance==null){
			instance=new Singleton(s);
			return instance;
		}
		return instance;
			
	}
	public static void main(String args[]){
		Singleton s=getInstance("Hello W");
		System.out.println(s.s);	
		Singleton s2=getInstance("Ola");
		System.out.println(s2.s);
	}
}
