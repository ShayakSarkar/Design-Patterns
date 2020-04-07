public class Main{
	public static void main(String args[]){
		Mercenary r=new Mercenary();
		r.fight();
		System.out.println(r.cost());
		System.out.println();

		Cavalry c=new Cavalry(r);
		c.fight();
		c.ride();
		System.out.println(c.cost());
		System.out.println();
		
		Artillery a=new Artillery(c);
		a.fight();
		a.fire();
		System.out.println(a.cost());
		System.out.println();
		
		Navy n=new Navy(a);
		n.fight();
		n.sail();
		System.out.println(n.cost());
	}

}

