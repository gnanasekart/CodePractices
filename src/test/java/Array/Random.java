package Array;

import java.util.concurrent.ThreadLocalRandom;

public class Random {

	public static void main(String[] args) {
		//randomClass();
		randomMethod();
	}

	public static void randomClass()
	{
		Random random = new Random();
		for(int i = 0; i < 5; i++)
		{
//			System.out.println("Random Integers : "+random.nextInt());
//			System.out.println("Random Doubles : "+random.nextDouble());
//			System.out.println("Random booleans : "+random.nextBoolean());
		}
	}
	
	public static void randomMethod()
    {  
		for(int i = 0; i < 5; i++)
        {
           // System.out.println("Random Doubles : "+Math.random());
            System.out.println("Random Integers : "+ThreadLocalRandom.current().nextInt());
        }
    System.out.println("Random integers between 0 and 50 using Math.random() :");
    
    for (int i = 0; i < 5; i++)
    {
       // System.out.println((int)(Math.random() * 50));
        System.out.println(ThreadLocalRandom.current().nextInt(0, 50));
    }
    }
}