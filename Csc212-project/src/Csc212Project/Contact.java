package Csc212Project;

public class Contact {
public class Contact implements Comparable<String>{
private String contactName;
private String phoneNumber;
private String emailAddress;
private String address;
private String birthday;
private String notes;

public Contact(){
}

public Contact(Contact c){
contactName=c.contactName;
phoneNumber=c.phoneNumber;
emailAddress=c.emailAddress;
address=c.address;
birthday=c.birthday;
notes=c.notes;
}

public Contact(String contactName, String phoneNumber, String emailAddress, String address, String birthday, String notes){
this.contactName=contactName;
this.phoneNumber=phoneNumber;
this.emailAddress=emailAddress;
this.address=address;
this.birthday=birthday;
this.notes=notes;
}

public String getContactName(){
return contactName;
}

public void setContactName(String n){
contactName=n;
}

public void setPhoneNumber(String p){
phoneNumber=p;
}

public void setEmailAddress(String e){
emailAddress=e;
}

public void setAddress(String a){
address=a;
}

public void setBirthday(String b){
birthday=b;
}

public void setNotes(String no){
notes=no;
}

public void display(){
System.out.print("contact name: "+contactName+" phone number: "+phoneNumber+" email address: "+emailAddress+" address: "+address+" birthday: "+birthday+" notes:"+notes);
}

public int compareTo(String s){
return contactName.compareTo(s);
}

public int compareTo(Contact c){
return contactName.compareTo(c.contactName);
}




}

}
