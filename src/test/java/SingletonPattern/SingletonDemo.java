package SingletonPattern;

public class SingletonDemo {
	
	//in Singleton class it consist of only one object at a time
	private static SingletonDemo singleton_ins = null;
	public String str;
	
	//By Creating Private Constructor
	private SingletonDemo()
	{
		str = "Hello world";
	}
	
	//By creating a static method to pass the Singleton class instance
	//Lazy initialization
	public static SingletonDemo getInstance()
	{
		if(singleton_ins == null)
			singleton_ins = new SingletonDemo();
		return singleton_ins;
	}

	public static void main(String[] args) {

		SingletonDemo x = SingletonDemo.getInstance();
		SingletonDemo y = SingletonDemo.getInstance();
		System.out.println((x.str).toUpperCase());
		System.out.println((x.str).toLowerCase());
	}
}