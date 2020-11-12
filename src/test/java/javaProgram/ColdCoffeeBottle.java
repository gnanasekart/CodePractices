package javaProgram;

import java.util.Scanner;

public class ColdCoffeeBottle {

	static int drinkcount = 0;
	static int exchange;
	static int bottle;
	static int count =0;
	static int bottlecount;
	static int exchangeRatio;
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of cold coffee bottles");
	bottlecount = sc.nextInt();
	System.out.println("Inital cold coffee bottle count is - " +bottlecount);
	System.out.println("Enter no of Bottle Exchanges ratio ");
	exchangeRatio = sc.nextInt();
	System.out.println("Here we exchange "+ exchangeRatio +" empty Cold coffee bottle to 1 drinkable bottle");
	drinking(bottlecount, exchangeRatio);
	}

	public static void drinking(int bottle, int exchange)
	{
	  drinkcount = bottle;
	  bottlecalc(bottle, exchange);
	  System.out.println("drinkedcount " +drinkcount);
	}
	  

	public static void bottlecalc(int bottle, int exchange)
	{
	  if(bottle >= exchange)
	  {
	    int drink = bottle / exchange;
	    int nondrink = bottle % exchange;
	    drinkcount = drinkcount + drink;
	    bottlecalc(drink+nondrink, exchange);
	  }
	}
}