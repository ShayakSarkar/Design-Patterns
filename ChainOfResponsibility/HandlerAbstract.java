abstract class HandlerAbstract{
	public int reqHandled;
	public HandlerAbstract nextHandler;
	public abstract void handleRequest(String request,int requestType);
}
