package com.qa.LeafGround;

public class randomnumber {
	public static void main(String[] args)   
    {  
        // Generate random number between 5 to 30  
        int a = (int) (5 + (Math.random() * 100000));  
        
        // Output is different every time this code is executed    
        System.out.println("5"+a);  
        }  
}
