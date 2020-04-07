import java.util.*;
interface Observable{
	public void addSub(YTUser sub);
	public void removeSub(YTUser sub);
	public void notifySubs(String newVid);
}
