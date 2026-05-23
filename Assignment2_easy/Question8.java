public class Question8 {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Kala", "9800000000", "");
        Contact contact2 = new Contact("Purnima", "9876543210", "purnima1@gmail.com");

        contact1.displayDetails();
        contact2.displayDetails();
    }
}

class Contact{
    String name;
    String phoneNumber;
    String emailAddress;

    public Contact(String name, String phone, String email){
        this.name = name;
        this.phoneNumber = phone;
        this.emailAddress = email;
    }

    public void displayDetails(){
        if(this.emailAddress != ""){
            System.out.println("Name: " + this.name);
            System.out.println("PhoneNumber: " + this.phoneNumber);
            System.out.println("Email: " + this.emailAddress);
        }
    }
}