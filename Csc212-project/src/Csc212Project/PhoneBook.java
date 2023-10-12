package Csc212Project;
import java.util.Scanner;

public class Phonebook {
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
		
LinkedList <Contact> a1 = new LinkedList<Contact>();
EventLinkedList <Event> e1 = new EventLinkedList<Event>();

	
System.out.println("WelcometotheLinkedTreePhonebook!");
int ch = 0;
do{
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
		input.nextLine();
		String name = input.nextLine();
		System.out.println("Enter the contact's phone number: ");
		String number = input.next();
		System.out.println("Enter the contact's email address: ");
		String email = input.next();
		System.out.println("Enter the contact's address: ");
		String adrs = input.next();
		System.out.println("Enter the contact's birthday: ");
		String Birthday = input.next();
		System.out.println("Enter any notes for the contact: ");
		String note = input.next();
		Contact newContact = new Contact(name , number , email , adrs , Birthday , note);
		a1.add(newContact);
		System.out.println("Thank you");
		break;
		
		
	case 2:
		//search
		System.out.println("Enter search criteria: ");
		System.out.println("1.Name");
		System.out.println("2.PhoneNumber");
		System.out.println("3.Email Address");
		System.out.println("4.Address");
		System.out.println("5.Birthday");
		int choice1 = input.nextInt();
		break;
		
		
	case 3:
		//Delete by the phone number
		System.out.println("Enter the contact phone number that you want to delete: ");
		String ph = input.next();
		a1.findfirst();
		while(!a1.last())
		{
			if(a1.retrieve().getPhoneNumber().equals(ph)) {
			a1.delete(a1.retrieve());
			System.out.println("The contact has been deleted");}
			a1.findnext();
		}
		if(a1.retrieve().getPhoneNumber().equals(ph)) {
		a1.delete(a1.retrieve());
		System.out.println("The contact has been deleted");}
		
		break;
		
		
	case 4:
		//add an event 
		System.out.println("Enter event title: ");
		input.nextLine();
		String title = input.nextLine();
		System.out.println("Enter the contact name: ");
		String contact_n = input.nextLine();
		a1.findfirst();
		Contact contact_name = a1.retrieve(); //head for now 
		while(!a1.last())
		{
			if(a1.retrieve().getContactName().replaceAll("\\s+","").equalsIgnoreCase(contact_n.replaceAll("\\s+",""))){//Search for the contact by name and retrieve it 
			contact_name = a1.retrieve();}
			a1.findnext();
		}
		if(a1.retrieve().getContactName().replaceAll("\\s+","").equalsIgnoreCase(contact_n.replaceAll("\\s+",""))) { //check for the last element
		contact_name = a1.retrieve();}
		System.out.println("Enter event date and time: ");
		String date_time = input.nextLine();
		System.out.println("Enter event location: ");
		String location = input.nextLine();
		Event newEvent = new Event(title , date_time , location , contact_name);
		e1.add(newEvent);
		
		
	case 5:
		//we need search method in the Event Linked List
		break;

		
	case 6:
		//Print contacts by first name
		System.out.println("Enter the contact first name");
		String Contact_firstName = input.next();
			System.out.println("The contact who have the first name are:");
			a1.findfirst();
			while(!a1.last()) {
			String [] all_name = a1.retrieve().getContactName().split(" ");
			String first_name = all_name[0]; //to get the first name 
			if(first_name.equalsIgnoreCase(Contact_firstName)) {
			System.out.println(a1.retrieve().getContactName() + " , " + a1.retrieve().getPhoneNumber() + " , " + a1.retrieve().getAddress() + " , " + a1.retrieve().getBirthday() + " , " + a1.retrieve().getNote());}
			a1.findnext();
			}
			String [] all_name = a1.retrieve().getContactName().split(" ");
			String first_name = all_name[0];
			if(first_name.equalsIgnoreCase(Contact_firstName)) {
			System.out.println(a1.retrieve().getContactName() + " , " + a1.retrieve().getPhoneNumber() + " , " + a1.retrieve().getAddress() + " , " + a1.retrieve().getBirthday() + " , " + a1.retrieve().getNote());}
		break;
		
		
		
	case 7:
		// Print all events alphabetically >> its already ordered(when we add it) so we just need to print it
		e1.findfirst();
while(!e1.last())
{
	Event e2 = e1.retrieve();
	System.out.println(e2.getEventTitle() + "," + e2.getDateAndTime() + "," + e2.getLocation() + "," + e2.getContact().getContactName());
	e1.findnext();
}
Event e2 = e1.retrieve();
System.out.println(e2.getEventTitle() + "," + e2.getDateAndTime() + "," + e2.getLocation() + "," + e2.getContact().getContactName());// for the last element
break;


case 8:
	ch = 8;
	break;
	}
	

}while(ch != 8);

//هذا حطيته عشان اشوف الليست بعد التعديل وكذا يعني حق تشييك مو من ضمن الكود
a1.findfirst();
while(!a1.last()) {
	System.out.println(a1.retrieve().getContactName());
	a1.findnext();
	
}
System.out.println(a1.retrieve().getContactName());
a1.findnext();

}}
