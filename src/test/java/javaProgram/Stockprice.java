package javaProgram;

public class Stockprice {

	public static void main(String[] args) 
	{
		int price[] = {7, 1, 5, 3, 6, 4};
		int profit = 0;
		int prof = 0;
		for (int i = 0; i< price.length; i++)
		{
			for(int j = i+1; j<price.length; j++)
			{
				if(price[i] < price[j]) 
				{
					profit = price[j] - price[i] ;
					if(profit > price[i])
					{  
						prof = profit > prof ? profit: prof;
						System.out.println("profit of day "+(i+1)+" and is "+prof+ " for principal value "+price[i]);
					}
				}
			}
		}
	}
}