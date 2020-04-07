class Requester{
	Proxy proxy;
	public Requester(Proxy p){
		proxy=p;
	}
	public void makeRequest(int id){
		Page p=proxy.retObj(id);
		if(p!=null)
			System.out.println("Page receieved");
		else
			System.out.println("Page not receieved");
	}
}


