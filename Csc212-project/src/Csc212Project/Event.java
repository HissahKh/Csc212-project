package Csc212Project;

public class Event {
 private String eventTitle;
    private String dateAndTime;
    private String location;
    private Contact contact;
    
    public Event(){
    }

    public Event(String eventTitle, String dateAndTime, String location, Contact contact) {
        this.eventTitle = eventTitle;
        this.dateAndTime = dateAndTime;
        this.location = location;
        this.contact = contact;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public String getLocation() {
        return location;
    }

    public Contact getContact() {
        return contact;
    }
    
    public void display(){
System.out.print("event title: "+eventTitle);
System.out.print("date and time of event: "+dateAndTime);
System.out.print("location of event: "+location);
System.out.print("contact involved in this event: "+contact);
}
 
    
    
    

    
    
    
    
}
}
