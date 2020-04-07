import java.util.HashMap;
class Proxy implements ServerInterface{
	HashMap<Integer,Page> localCache;
	Server server;
	public Proxy(Server s){
		localCache=new HashMap<Integer,Page>();
		this.server=s;
	}
	public Page retObj(int id){
		if(localCache.containsKey(id)){
			System.out.println("Page found in proxy's cache");
			return localCache.get(id);
		}
		Page p=server.retObj(id);
		localCache.put(id,p);
		return p;
	}
}
