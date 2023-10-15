/**
 * 
 */
package com.gqt.ShoppingApp.project;

import java.util.Scanner;

/**
 * @author MUBEENA
 *
 */
public class SoppingApplication {
	public static int key;
	public static int key1;

	public static void women() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to women clothing section \n"+"---------------------------------- \n"+"1.Kurtas \n"
				+"2.Sarees \n");
		key1=sc.nextInt();
		System.out.println("**Specifications**");
		System.out.println("*cost=4000* \t  *Fabric=Cotton Clothing*");
		System.out.println("Do you want to purchase???");

		boolean b=sc.nextBoolean();
		if(b==true) {
			System.out.println("**Cash Receipt** \n"+"----------------- \n"+"Cost \t\t\t 4000 \n"+"Gst \t\t\t 0 \n"+"TotalCost \t\t 4000");
			System.out.println("Thank u for Shopping :)");
			System.out.println("Do u want to continue shopping??");
			boolean b1=sc.nextBoolean();
			if(b1==true) {
				main(null);
			}
			else
				System.out.println("Thank you for shopping!!!");
				System.exit(0);

		}
		else
			System.out.println("Thank You,Visit Again..");
			System.exit(0);
	}
	public static void men() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to men clothing section \n"+"---------------------------------- \n"+"1.Jeans \n"
				+"2.Shirt \n");
		key1=sc.nextInt();
		System.out.println("**Specifications**");
		System.out.println("*cost=4000* \t  *Fabric=Cotton Clothing*");
		System.out.println("Do you want to purchase???");
		boolean b=sc.nextBoolean();
		if(b==true) {
			System.out.println("**Cash Receipt** \n"+"----------------- \n"+"Cost \t\t\t 4000 \n"+"Gst \t\t\t 0 \n"+"TotalCost \t\t 4000");
			System.out.println("Thank u for Shopping :)");
			System.out.println("Do u want to continue shopping??");
			boolean b1=sc.nextBoolean();
			if(b1==true) {
				main(null);
			}
			else
				System.out.println("Thank you for shopping!!!");
				System.exit(0);
		}
		else
			System.out.println("Thank You,Visit Again..");
			System.exit(0);
	}
	public static void children() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to children clothing section \n"+"---------------------------------- \n"+"1.Froks \n"
				+"2.Jeans \n");
		key1=sc.nextInt();
		System.out.println("**Specifications**");
		System.out.println("*cost=4000* \t  *Fabric=Cotton Clothing*");
		System.out.println("Do you want to purchase???");
		boolean b=sc.nextBoolean();
		if(b==true) {
			System.out.println("**Cash Receipt** \n"+"----------------- \n"+"Cost \t\t\t 4000 \n"+"Gst \t\t\t 0 \n"+"TotalCost \t\t 4000");
			System.out.println("Thank u for Shopping :)");
			System.out.println("Do u want to continue shopping??");
			boolean b1=sc.nextBoolean();
			if(b1==true) {
				main(null);
			}
			else
				System.out.println("Thank you for shopping!!!");
				System.exit(0);
		}
		else
			System.out.println("Thank You,Visit Again..");
			System.exit(0);
	}
	public static void TV() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to TV section \n"+"---------------------------------- \n"+"1.OnePlus 80cm \n"
				+"2.Toshiba \n");
		key1=sc.nextInt();
		System.out.println("**Specifications**");
		System.out.println("*cost=40,000* \t  *32 inches* \t *Smart LED Google TV*");
		System.out.println("Do you want to purchase???");
		boolean b=sc.nextBoolean();
		if(b==true) {
			System.out.println("**Cash Receipt** \n"+"----------------- \n"+"Cost \t\t\t 40,000 \n"+"Gst \t\t\t 100 \n"+"TotalCost \t\t 40,100");
			System.out.println("Thank u for Shopping :)");
			System.out.println("Do u want to continue shopping??");
			boolean b1=sc.nextBoolean();
			if(b1==true) {
				main(null);
			}
			else
				System.out.println("Thank you for shopping!!!");
				System.exit(0);
		}
		else
			System.out.println("Thank You,Visit Again..");
			System.exit(0);
	}
	public static void Laptops() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Laptop section \n"+"---------------------------------- \n"+"1.Lenovo \n"
				+"2.HP \n");
		key1=sc.nextInt();
		System.out.println("**Specifications**");
		System.out.println("*cost=50,000* \t  *16GB* \t *512GB SSD* \t *Windows 11*");
		System.out.println("Do you want to purchase???");
		boolean b=sc.nextBoolean();
		if(b==true) {
			System.out.println("**Cash Receipt** \n"+"----------------- \n"+"Cost \t\t\t 50,000 \n"+"Gst \t\t\t 100 \n"+"TotalCost \t\t 50,100");
			System.out.println("Thank u for Shopping :)");
			System.out.println("Do u want to continue shopping??");
			boolean b1=sc.nextBoolean();
			if(b1==true) {
				main(null);
			}
			else
				System.out.println("Thank you for shopping!!!");
				System.exit(0);
		}
		else
			System.out.println("Thank You,Visit Again..");
			System.exit(0);
	}
	public static void Wardrobes() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Wadrobes section \n"+"-------------------------------- \n"+"1.Wooden \n"
				+"2.Plastic \n");
		key1=sc.nextInt();
		System.out.println("**Specifications**");
		System.out.println("*cost=9,000* \t  *Color:Walnut* \t *Style Name:Without Mirror*");
		System.out.println("Do you want to purchase???");
		boolean b=sc.nextBoolean();
		if(b==true) {
			System.out.println("**Cash Receipt** \n"+"----------------- \n"+"Cost \t\t\t 9,000 \n"+"Gst \t\t\t 100 \n"+"TotalCost \t\t 9,100");
			System.out.println("Thank u for Shopping :)");
			System.out.println("Do u want to continue shopping??");
			boolean b1=sc.nextBoolean();
			if(b1==true) {
				main(null);
			}
			else
				System.out.println("Thank you for shopping!!!");
				System.exit(0);
		}
		else
			System.out.println("Thank You,Visit Again..");
			System.exit(0);
	}
	public static void Mattresses() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Mattresses section \n"+"---------------------------------- \n"+"1.SleepyCat \n"
				+"2.Duroflex \n");
		key1=sc.nextInt();
		System.out.println("**Specifications**");
		System.out.println("*cost=20,000* \t  *Size:Single* \t *Style Name:78x72x6*");
		System.out.println("Do you want to purchase???");
		boolean b=sc.nextBoolean();
		if(b==true) {
			System.out.println("**Cash Receipt** \n"+"----------------- \n"+"Cost \t\t\t 20,000 \n"+"Gst \t\t\t 0 \n"+"TotalCost \t\t 20,000");
			System.out.println("Thank u for Shopping :)");
			System.out.println("Do u want to continue shopping??");
			boolean b1=sc.nextBoolean();
			if(b1==true) {
				main(null);
			}
			else
				System.out.println("Thank you for shopping!!!");
				System.exit(0);
		}
		else
			System.out.println("Thank You,Visit Again..");
			System.exit(0);
	}
	public static void Creams() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to  Creams section \n"+"---------------------------------- \n"+"1.Nivea \n"
				+"2.Vaseline \n");
		key1=sc.nextInt();
		System.out.println("**Specifications**");
		System.out.println("*cost=500* \t *Type:Moisturizer");
		System.out.println("Do you want to purchase???");
		boolean b=sc.nextBoolean();
		if(b==true) {
			System.out.println("**Cash Receipt** \n"+"----------------- \n"+"Cost \t\t\t 500 \n"+"Gst \t\t\t 0 \n"+"TotalCost \t\t 500");
			System.out.println("Thank u for Shopping :)");
			System.out.println("Do u want to continue shopping??");
			boolean b1=sc.nextBoolean();
			if(b1==true) {
				main(null);
			}
			else
				System.out.println("Thank you for shopping!!!");
				System.exit(0);
		}
		else
			System.out.println("Thank You,Visit Again..");
			System.exit(0);
	}
	public static void Deos() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Deos section \n"+"---------------------------------- \n"+"1.Yardley London \n"
				+"2.Park Avenue \n");
		key1=sc.nextInt();
		System.out.println("**Specifications**");
		System.out.println("*cost=500* \t *Type:No Gas*");
		System.out.println("Do you want to purchase???");
		boolean b=sc.nextBoolean();
		if(b==true) {
			System.out.println("**Cash Receipt** \n"+"----------------- \n"+"Cost \t\t\t 500 \n"+"Gst \t\t\t 0 \n"+"TotalCost \t\t 500");
			System.out.println("Thank u for Shopping :)");
			System.out.println("Do u want to continue shopping??");
			boolean b1=sc.nextBoolean();
			if(b1==true) {
				main(null);
			}
			else
				System.out.println("Thank you for shopping!!!");
				System.exit(0);
		}
		else
			System.out.println("Thank You,Visit Again..");
			System.exit(0);
	}
	public static void Cycles() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Cycles section \n"+"---------------------------------- \n"+"1.Geared Cycles \n"
				+"2.Electric Cycles \n");
		key1=sc.nextInt();
		System.out.println("**Specifications**");
		System.out.println("*cost=12,000* \t *Company:Hero Sprint Riot 26T MTB* \t *Color:Grey*");
		System.out.println("Do you want to purchase???");
		boolean b=sc.nextBoolean();
		if(b==true) {
			System.out.println("**Cash Receipt** \n"+"----------------- \n"+"Cost \t\t\t 12,000 \n"+"Gst \t\t\t 0 \n"+"TotalCost \t\t 12,000");
			System.out.println("Thank u for Shopping :)");
			System.out.println("Do u want to continue shopping??");
			boolean b1=sc.nextBoolean();
			if(b1==true) {
				main(null);
			}
			else
				System.out.println("Thank you for shopping!!!");
				System.exit(0);
		}
		else
			System.out.println("Thank You,Visit Again..");
			System.exit(0);
	}
	public static void Cricket() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Cricket section \n"+"---------------------------------- \n"+"1.Bat \n"
				+"2.Ball \n");
		key1=sc.nextInt();
		System.out.println("**Specifications**");
		System.out.println("*cost=9,000* \t *Company:GM Diamond* \t *Color:Multi Color*");
		System.out.println("Do you want to purchase???");
		boolean b=sc.nextBoolean();
		if(b==true) {
			System.out.println("**Cash Receipt** \n"+"----------------- \n"+"Cost \t\t\t 9,000 \n"+"Gst \t\t\t 0 \n"+"TotalCost \t\t 9,000");
			System.out.println("Thank u for Shopping :)");
			System.out.println("Do u want to continue shopping??");
			boolean b1=sc.nextBoolean();
			if(b1==true) {
				main(null);
			}
			else
				System.out.println("Thank you for shopping!!!");
				System.exit(0);
		}
		else
			System.out.println("Thank You,Visit Again..");
			System.exit(0);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\t \t \t \t \t \t \t Welcome to Amazon Shopping \t \t \t \t");
		System.out.println("\t \t \t \t \t \t \t --------------------------");
		System.out.println("Please select the category you wish to shop...... \n"+"1.Fashion \n"+"2.Electronics \n"+"3.Furniture \n"
				+"4.Beauty \n"+"5.Sports \n"+"6.Exit \n"
				+ "7.Restart");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("\t \t  Welcome to Fashion zone");
			System.out.println("\t \t  -----------------------");
			System.out.println("1.Women \n"
					+ "2.Men \n"
					+ "3.Children \n");
			key=sc.nextInt();
			switch(key) {
			case 1:{
				women();
				break;
			}
			case 2:{
				men();
				break;
			}
			case 3:{
				children();
				break;
			}
			}
		}
		case 2:{
			System.out.println("\t \t  Welcome to ELectronics zone");
			System.out.println("\t \t  -----------------------");
			System.out.println("1.TV \n"
					+ "2.Laptops \n");
			key=sc.nextInt();
			switch(key) {
			case 1:{
				TV();
				break;
			}
			case 2:{
				Laptops();
				break;
			}
			}
		}
		case 3:{
			System.out.println("\t \t  Welcome to Furniture zone");
			System.out.println("\t \t  -----------------------");
			System.out.println("1.Wardrobes \n"
					+ "2.Mattresses \n");
			key=sc.nextInt();
			switch(key) {
			case 1:{
				Wardrobes();
				break;
			}
			case 2:{
				Mattresses();
				break;
			}
			}
		}
		case 4:{
			System.out.println("\t \t  Welcome to Beauty zone");
			System.out.println("\t \t  -----------------------");
			System.out.println("1.Creams \n"
					+ "2.Deos \n");
			key=sc.nextInt();
			switch(key) {
			case 1:{
				Creams();
				break;
			}
			case 2:{
				Deos();
				break;
			}
			}
		}
		case 5:{
			System.out.println("\t \t  Welcome to Sports zone");
			System.out.println("\t \t  -----------------------");
			System.out.println("1.Cycling \n"
					+ "2.Cricket \n");
			key=sc.nextInt();
			switch(key) {
			case 1:{
				Cycles();
				break;
			}
			case 2:{
				Cricket();
				break;
			}
			}
		}
		case 6:{
			System.out.println("Thank You");
			System.exit(0);
		}
		case 7:{
			main(null);
		}
		default:
			System.out.println("This is not a valid option \n Please try Again.......");
		}
		main(null);
	}
}
