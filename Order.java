package main;

import java.util.Scanner;

public class Order
	{
		final double TAX = .05; 	//sales tax
		
	private	long zipcode;
	private	String name;
	private String delivery;
	private int burger_count;
	private int drink_count;
	private int fry_count;
	private int dessert_count;
	private int icecream_count;
	private double order_total;
	private double finalamount;
	private double deliveryfee;
	
	private String [] menu = {"Burger", "Drink", "Fries", "Dessert", "Icecream"}; //menuArray
	private Double[] menu_price = {4.50, 1.50, 2.50, 3.00, 1.20};
	private int [] count = {0,0,0,0,0};//tried to make array for count LOL
	
	public Order(String owner, long address) //String choice
 	{
	 setZipcode(address);
	 name = owner;
	}//ORDER Constructor
	 
    //customer decides pick-up/delivery
	public void setDelivery(String p_delivery) 
	{
		delivery = p_delivery;
	}
		

	//if yes to delivery, customer sets zipcode
	 public void setZipcode(long p_zipcode)
	 {
		zipcode = p_zipcode;
		System.out.println(zipcode);
		if (zipcode <= 60450)
		{	
			if (zipcode >= 60442)
			{
			System.out.println("Delivery Available");
			deliveryfee = 5.00;
			}
			else if (zipcode == 60441)
			{
			System.out.println("Delivery with Extra Cost");
			deliveryfee = 7.00;
			}
			else
			{
				System.out.println("Delivery not Available");
				deliveryfee = 0.00;
			}
		}
		else if (zipcode == 60451)
		{
		System.out.println("Delivery with Extra Cost");
		deliveryfee = 7.00;
		}
		else 
		{
			System.out.println("Delivery Not Available");
			deliveryfee = 0.00;
		}
	}//setZipcode
	
	 public long getZipcode()
	 {
		 return zipcode;
	 }
		
	 //get the menu, stored in an array
	 
	 
	public void displayMenu() 
	{
		System.out.println("\n\n*********************");
		System.out.println("FLYERS' MENU");
		System.out.println("------------"); //make it fancy
		System.out.println("FOOD           PRICE");
	      for (int i = 0; i < menu.length; i++) 
	      {
	         if (i > 0) 
	         {
	            System.out.print(" ");
	         }
	         System.out.print("\n" + menu[i] + "........" + "$" + menu_price[i]);
	      }
	}	

	
	//set counts
	public void setBurger_count(int p_burgercount)
	{
	 burger_count = p_burgercount;
	}
	
	public int getBurger_count()
	{
	 return burger_count;
	}
	
	public void setDrink_count(int p_drinkcount)
	{
	 drink_count = p_drinkcount;
	}
	
	public int getDrink_count()
	{
	 return drink_count;
	}
	
	public void setFry_count(int p_frycount)
	{
	 fry_count = p_frycount;
	}
	
	public int getFry_count()
	{
	 return fry_count;
	}
	public void setDessert_count(int p_dessertcount)
	{
	 dessert_count = p_dessertcount;
	}
	
	public int getDessert_count()
	{
	 return dessert_count;
	}
	
	public void seticecream_count(int p_icecreamcount)
	{
	 icecream_count = p_icecreamcount;
	}
	
	public int geticecream_count()
	{
	 return icecream_count;
	}
	public void setOrder_total()
	{
	 order_total = (burger_count*4.5 + drink_count*1.5 + fry_count*2.5 + dessert_count*3.00 + icecream_count*1.2);
	}
	
	public double getOrder_total()
	{
	 return order_total;
	}
	public void setFinalamount()
	{
	 finalamount = (order_total + (order_total*.05) + deliveryfee);
	}
	public double getFinalamount()
	{
	 return finalamount;
	}
	public void displaydeliveryfee() 
	{
		System.out.println("Delivery fee = $" + String.format("%,.2f", deliveryfee));
	}
	
	
	}
