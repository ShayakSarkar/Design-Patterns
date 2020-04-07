class YTUser implements Observer{
	public int userId;
	public YTUser(int userId){
		this.userId=userId;
	}
	public void update(YTChannel channel){
		System.out.println("User "+userId+" notified");
		System.out.println("updated...New Vid is "+channel.newVid);
	}
}
