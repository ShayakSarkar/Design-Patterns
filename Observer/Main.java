import java.util.*;

public class Main{
	public static void main(String args[]){
		YTChannel channel=new YTChannel();
		YTUser user1=new YTUser(1);
		YTUser user2=new YTUser(2);
		YTUser user3=new YTUser(3);
		YTUser user4=new YTUser(4);
		channel.addSub(user1);
		channel.addSub(user2);
		channel.addSub(user3);
		channel.addSub(user4);
		channel.notifySubs("How to Dance like a pro in 30 days");
		channel.notifySubs("How to crack IIT JEE");
	}
}
