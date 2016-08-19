package pl.javadevmatt.observer;


public class Client{
	
	public static void main(String[] args) {
		
		YTChannel ytChannel = new YTChannel();
		
		YTUser ytUser = new YTUser("Matt");
		ytChannel.register(ytUser);
		
		/**
		 * 
		 * 
		 * 
		 * 
		 */
		
		ytChannel.publishNewVideo();
		System.out.println("------------------");
		
		YTUser ytUser2 = new YTUser("Patt");
		ytChannel.register(ytUser2);
		ytChannel.publishNewVideo();
		System.out.println("------------------");
		
		ytChannel.unregister(ytUser);
		ytChannel.publishNewVideo();
		System.out.println("------------------");
	}

}
