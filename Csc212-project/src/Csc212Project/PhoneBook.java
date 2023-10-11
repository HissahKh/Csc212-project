package Csc212Project;
import java.util.Scanner;
public class PhoneBook {
public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
//LinkedList <> a1 = new LinkedList<>();		
System.out.println("WelcometotheLinkedTreePhonebook!");
int ch = 0;
while(ch != 8){
	System.out.println("Please choose an option:");
	System.out.println("1.Add a contact");
	System.out.println("2.Search for a contact");
	System.out.println("3.Delete a contact");
	System.out.println("4.Schedule an event");
	System.out.println("5.Print event details");
	System.out.println("6.Print contacts by firstname");
	System.out.println("7.Print all events alphabetically");
	System.out.println("8.Exit");
	int choice = input.nextInt();
	ch = choice;
	switch (choice)
	{
	case 1:
		//Add a Contact
		System.out.println("Enter the contact's name: ");
		String name = input.next();
		System.out.println("Enter the contact's phone number: ");
		int number = input.nextInt();
		System.out.println("Enter the contact's email address: ");
		String email = input.next();
		System.out.println("Enter the contact's address: ");
		String adrs = input.next();
		System.out.println("Enter the contact's birthday: ");
		String Birthday = input.next();
		System.out.println("Enter any notes for the contact: ");
		String note = input.next();
		//Contact newContact = new Contact(name , number , email , adrs , Birthday , note);
		//a1.insert(newContact);
		System.out.println("Contact added successfully!");
		break;
		
	case 2:
		System.out.println("Enter search criteria:");
		System.out.println("1.Name");
		System.out.println("2.Phone Number");
		System.out.println("3.Email Address");
		System.out.println("4.Address");
		System.out.println("5.Birthday");
		//Search 
		break;
	
	case 3: 
		//remove
		break;
		
	case 4:
		//Schedule an event
		
		
	case 5:
		System.out.println("Enter search criteria:");
		System.out.print("1.contact name ");
		System.out.print("2.Event tittle");
		int s = input.nextInt();
		switch(s) {
		case 1:
			System.out.println("Enter contact name: ");
			String n = input.next();
			//a1.Search(n);
			break;
		case 2:
			System.out.println("Enter the event title: ");
			String t = input.next();
			//a1.Search(t);
		}
		//Print event details
		
		
	case 6:
		//Print contacts by first name
	case 7:
		//Print all events alphabetically
	case 8:
		System.out.print("Goodbye!");
		ch = 8;
		break;
	default:
		System.out.print("Wront input please try again!");
		
					
		
	}

	
}
	}
}
