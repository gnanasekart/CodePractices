package ThreadConcept;


class Printer
{
	//	synchronized void printing(String name)
	void printing(String name)
	{
		for(int i = 1; i< 10; i++)
		{
			System.out.println(i+" = Printing "+name+" call");
		}
	}
}

class Mythread extends Thread
{
	Printer pref;

	Mythread(Printer print)
	{
		pref = print;
	}

	public void run()
	{	
		for(int i = 1; i< 2; i++)
		{
			synchronized (pref) {
				pref.printing("gnana");
				System.out.println("-------------------");
			}
		}
	}
}

class Yourthread extends Thread
{
	Printer pref;

	Yourthread(Printer print)
	{
		pref = print;
	}

	public void run()
	{	
		synchronized (pref) {
			for(int i = 1; i< 2; i++)
			{
				pref.printing("sekar");
			}
		}
	}
}


public class multiThreadConcept {

	public static void main(String[] args) {

		System.out.println("job started");

		Printer print = new Printer();
		//print.printing();

		/*-------1. Async scenario----------
		 * 
		//scenario is we have multiple thread working on the same printer object
		//so the output will be combination of both the output. in real time consider
		 *  each thread is a printer printing 
		//in that case first printer need to complete and then start the second printer.

		Mythread mref = new Mythread(print);

		//Mythread is having reference to the printer object
		//here main thread and Mythread will execute in seperate thread

		Yourthread yref = new Yourthread(print);

		//here main thread and Mythread will execute in seperate thread

		yref.start();
		mref.start();
		 */

		//	Solution - if multiple threads are going to work on same single object we must sync them

		//*-------2. sync scenario using join method----------

		Mythread mref = new Mythread(print);
		Yourthread yref = new Yourthread(print);
		yref.start();
		mref.start();

		/*try {
			mref.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		If we mention as Join means this will be need to call for each and every call of that object like
		mref.join(); below the mref.start();
		yref.join(); below the yref.start();

		 *
		 *---------------------3. synchronized block at printer class level----------------- 
		 *
		 *----------------------4. synchronized at the thread class run block level-------------------
		 */



		System.out.println("job ended");
	}
}