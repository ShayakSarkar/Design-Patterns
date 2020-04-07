public class Main{
	public static void main(String args[]){
		WarriorPreparation cp=new Cavalry("CAVALRY 5 REG 1233");
		WarriorPreparation ap=new Artillery("ARTILLERY 6 REG 12331");
		cp.prepare();
		System.out.println("\n\n");
		ap.prepare();

	}
}
