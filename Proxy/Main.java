public class Main{
	public static void main(String args[]){
		Server server=new Server();
		Proxy proxy=new Proxy(server);
		Requester req=new Requester(proxy);
		req.makeRequest(2);
		req.makeRequest(2);
	}
}
