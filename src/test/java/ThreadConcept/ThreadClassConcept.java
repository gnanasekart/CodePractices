package ThreadConcept;

class MyApp
{
	void task()
	{
	for(int d = 1; d <= 10; d++)
	{
		System.out.println(d+" = job out is running ");
	}
}
}

class Mytask extends Thread
{
	public void run()
	{
	for(int d = 1; d <= 10; d++)
	{
		System.out.println(d+" = job run() is running ");
	}
}
}


public class ThreadClassConcept {

	public static void main(String[] args) {
		//1
		System.out.println(" job 1 running ");
		
		
		//2
		MyApp my = new MyApp();
		//my.task();
		
		
		//2 thread run
		Mytask myt = new Mytask();
		myt.start();
		//start will internally call the run()
		//here main and Mytask are running parallelly
		
		
		//3
		for(int d = 1; d <= 10; d++)
		{
			System.out.println(d+" = job 2 is running ");
		}
		
		//4
		System.out.println("job 3 is finished");
	}

}
