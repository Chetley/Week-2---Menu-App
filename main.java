package main;

import java.util.Scanner;

public class main 
{

	public static void main(String[] args) 
	
	{
		long zip_code;
		String name;
		int delivery_choice;
		double order_total;
		 
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Name for order?");
	    name = scan.nextLine();
	    System.out.println("Your name:" + name);
	    
	    // customer chooses delivery method
	    System.out.println("Press 1 for Delivery\nPress 2 for Pick-up");
	    delivery_choice = scan.nextInt();
		System.out.println("You entered:" + delivery_choice);

		//make it fancy
		System.out.println("\n*******************************");
		
	    // customer adds zipcode
		if (delivery_choice == 1);
		{
			System.out.println("For delivery, enter your zipcode");
			zip_code = scan.nextLong();
		}
		
		Order order1 = new Order(name, zip_code);
		order1.displayMenu();

		System.out.println("\n*********************");
	
		
	    System.out.println("\n Enter the amount of burgers would you like:");
	    int burgerCount = scan.nextInt();
	    order1.setBurger_count(burgerCount);
	    
	    if (burgerCount == 1)
	    {
	    	System.out.println("You chose " + burgerCount + " burger");
	    }//if
	    else
	    {
	    	System.out.println("You chose " + burgerCount + " burgers");
	    }//else
	    
	    System.out.println("Current total = $" + burgerCount*4.5);
	    
	    System.out.println("\n*********************");

	    System.out.println("\nEnter the amount of drinks would you like:");
	    int drinkCount = scan.nextInt();
	    order1.setDrink_count(drinkCount);
	    
	    if (drinkCount == 1)
	    {
	    	System.out.println("You chose " + drinkCount + " drink");
	    }//if
	    else
	    {
	    	System.out.println("You chose " + drinkCount + " drinks");
	    }//else
	   
	    System.out.println("Current total = $" + (burgerCount*4.5 + drinkCount*1.5));
	    
	    System.out.println("\n*********************");

	    System.out.println("\nEnter the amount of fries would you like:");
	    int fryCount = scan.nextInt();
	    order1.setFry_count(fryCount);
	    
	    if (fryCount == 1)
	    {
	    	System.out.println("You chose " + fryCount + " fry");
	    }//if
	    	else
	    	{
	    		System.out.println("You chose " + fryCount + " fries");
	    	}//else
	   
	    System.out.println("Current total = $" + (burgerCount*4.5 + drinkCount*1.5 + fryCount*2.5));
	    
	    System.out.println("\n*********************");

	    System.out.println("\nEnter the amount of desserts would you like:");
	    int dessertCount = scan.nextInt();
	    order1.setDessert_count(dessertCount);
	    
	    if (dessertCount == 1)
	    {
	    	System.out.println("You chose " + dessertCount + " dessert");
	    }//if
	    else
	    {
	    	System.out.println("You chose " + dessertCount + " desserts");
	    }//else
	   
	    System.out.println("Current total = $" + (burgerCount*4.5 + drinkCount*1.5 + fryCount*2.5 + dessertCount*3.00));

	    System.out.println("\n*********************");

	    System.out.println("\nEnter the amount of ice creams would you like:");
	    int icecreamCount = scan.nextInt();
	    order1.seticecream_count(icecreamCount);
	    
	    if (icecreamCount == 1)
	    {
	    	System.out.println("You chose " + icecreamCount + " ice cream");
	    }//if
	    else
	    {
	    	System.out.println("You chose " + icecreamCount + " ice cream");
	    }//else
	   
	    System.out.println("\n*********************");

	    
	    
	    order1.setOrder_total();
	    order_total= order1.getOrder_total();
	    System.out.println("Current total = $" + String.format("%,.2f", order_total));
	    
	    order1.displaydeliveryfee();
	    
	    order1.setFinalamount();
	    double Finalamount = order1.getFinalamount();
	    System.out.println("Order total after tax with delivery fee = $" + String.format("%,.2f", Finalamount));
	    
	    
		    
	}

		
	}

