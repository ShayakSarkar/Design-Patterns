import java.util.*;
class YTChannel implements Observable{
	public HashSet<YTUser> subscribers;
	public String newVid;
	public YTChannel(){
		subscribers=new HashSet<YTUser>();
		newVid="";
	}
	public void addSub(YTUser sub){
		subscribers.add(sub);
	
	}
	public void removeSub(YTUser sub){
		subscribers.remove(sub);
	}
	public void notifySubs(String newVid){
		this.newVid=newVid;
		for(YTUser user : subscribers){
			user.update(this);
		}
	}

}
