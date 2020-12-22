package ThreadConcept;

class MyIfApp
{
	void task()
	{

	}
}

//class Mytask extends Thread, MyApp  -> multiple inheritance is not possible

class MyIftask extends MyIfApp implements Runnable
{
	public void run()
	{
		for(int d = 1; d <= 10; d++)
		{
			System.out.println(d+" = job run() is running ");
		}
	}
}


public class RunnableInterfaceConcept {

	public static void main(String[] args) {
		//1
		System.out.println(" job 1 running ");

		//2
		Runnable r = new MyIftask();
		Thread t = new Thread(r);   // Thread t = new Thread(new MyIftask());
		t.start();		
		

		//3
		for(int d = 1; d <= 10; d++)
		{
			System.out.println(d+" = job 2 is running ");
		}

		//4
		System.out.println("job 3 is finished");
	}
}