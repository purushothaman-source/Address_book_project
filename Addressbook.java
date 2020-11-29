package com.java.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Contacts {
	String firstName, lastName, address, city, state;
	long zip, phoneNumber;
	int id;

	public Contacts( String firstName, String lastName, String address, String city, String state, long zip,
			long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Contacts [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + "]";
	}

}


public class Addressbook {
	static Scanner input = new Scanner(System.in);
	static HashMap<String, Contacts> addressbook = new HashMap<String, Contacts>();


		
		public static void main(String[] args) {

			int num = 1;
			
			while (num!=0) {
				
				System.out.println("enter the number 1 for add ;2 for remove; 3 for replace ;4 for sortbyname");
				int number = input.nextInt();

				switch (number) {
				case 1:


					add();
					break;
				case 2:
					remove();
					break;

				case 3:
					replace();
					break;
				case 4:
					sortbyname();
					break;
				case 5:
					sortbyzipcode();
					break;
				
				default:
					System.out.println("error");
				}

				System.out.println("if you want stop press 1 else press any integer values");
				int check =input.nextInt();
				if( check == 1) {
					break;
				}

			}
			
			//System.out.println(addressbook);
			 System.out.println("Iterating Hashmap...");  
			   for(Map.Entry<String,Contacts> m : addressbook.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue()); }   
			
		

		}

		public static void add() {
			System.out.println("enter the details by this order(firstName,LastName,address,city,state,zipcode,phoneNumber");
		
			String FN = input.next();
			String LN = input.next();
			String ADD = input.next();
			String CY = input.next();
			String ST = input.next();
			long Zp = input.nextLong();
			long Pn = input.nextLong();
			addressbook.put(FN, new Contacts( FN, LN, ADD, CY, ST, Zp, Pn));

		}

		public static void remove() {
			System.out.println("enter the key to remove");
			String FN = input.next();
			addressbook.remove(FN);

		}

		public static void replace() {
			System.out.println("enter the detail by this order(firstName,LastName,address,city,state,zipcode,phoneNumber");
			
			String FN = input.next();
			String LN = input.next();
			String ADD = input.next();
			String CY = input.next();
			String ST= input.next();
			long Zp = input.nextLong();
			long Pn = input.nextLong();
			addressbook.replace(FN, new Contacts(FN, LN, ADD, CY, ST, Zp, Pn));

		}
		public static void sortbyname() {
			 Map< String,Contacts> map = new TreeMap<String, Contacts>(addressbook); 
			 System.out.println(map);
		}
		public static void sortbyzipcode() {
			
		}


	}


