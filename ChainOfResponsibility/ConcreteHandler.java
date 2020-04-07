class ConcreteHandler extends HandlerAbstract{
	public ConcreteHandler(HandlerAbstract obj,int reqHandled){
		nextHandler=obj;
		this.reqHandled=reqHandled;
	}
	public void handleRequest(String request,int requestType){
		if(reqHandled==requestType){
			System.out.println("Request handled by "+reqHandled);
		}
		else if(nextHandler!=null)
			nextHandler.handleRequest(request,requestType);
		else
			System.out.println("Request could not be handled ... there must be some problem elsewhere");
	}
}
