public class Main{
	public static void main(String args[]){
		ConcreteHandler ch1=new ConcreteHandler(null,1);
		ConcreteHandler ch2=new ConcreteHandler(ch1,2);
		ConcreteHandler ch3=new ConcreteHandler(ch2,3);
		ConcreteHandler ch4=new ConcreteHandler(ch3,4);
		ConcreteHandler ch5=new ConcreteHandler(ch4,5);
		ch5.handleRequest("REQUEST404",args[0].charAt(0)-'0');
	}
}


