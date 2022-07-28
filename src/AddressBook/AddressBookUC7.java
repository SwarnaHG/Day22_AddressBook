package AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookUC7 {
    ContactDetails person = new ContactDetails();
    List<ContactDetails> contactDetailsList = new ArrayList<ContactDetails>();
    Scanner scanner = new Scanner(System.in);


    public void addContact() {
        System.out.println("Enter the number of contacts to be added");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {


            System.out.println("Enter the first name of person");
            String fName = scanner.next();
            if (fName.equals(person.getFirstName())) {
                System.out.println("The name already exists");
            } else {
                System.out.println("Enter the contact details of person ");
                writeContact();
                System.out.println("Successfully added the contact");
            }
        }
    }


    public void writeContact() {
        System.out.println("Enter First Name : ");
        String firstName = scanner.next();
        System.out.println("Enter Last Name : ");
        String lastName = scanner.next();
        System.out.println("Enter Address : ");
        String address = scanner.next();
        System.out.println("Enter City : ");
        String city = scanner.next();
        System.out.println("Enter State : ");
        String state = scanner.next();
        System.out.println("Enter ZipCode : ");
        int zipCode = scanner.nextInt();
        System.out.println("Enter Mobile Number : ");
        long mobileNumber = scanner.nextLong();
        System.out.println("Enter EmailId : ");
        String emailId = scanner.next();
        person = new ContactDetails(firstName, lastName, address, city, state, zipCode, mobileNumber, emailId);
        contactDetailsList.add(person);

    }


    public void editContact() {
        System.out.println("Enter the first name to continue with editing");
        String editName = scanner.next();
        boolean edited = false;
        for (int i = 0; i < contactDetailsList.size(); i++) {
            String name = contactDetailsList.get(i).getFirstName();
            if (name.equalsIgnoreCase(editName)) {
                contactDetailsList.remove(person);
                writeContact();
                edited = true;
                break;
            }
        }
        if (!edited) {
            System.out.println("Incorrect Name");
        }
    }


    public void deleteContact() {
        System.out.println("Enter the first name of person to delete the contact");
        String deleteName = scanner.next();
        int i = 0;
        for (; i < contactDetailsList.size(); i++) {
            String name = contactDetailsList.get(i).getFirstName();
            if (name.equalsIgnoreCase(deleteName)) {
                break;
            }
        }
        if (i < contactDetailsList.size()) {
            contactDetailsList.remove(i);
            System.out.println("Contact Deleted");
            System.out.println("Remaining contacts in the book");
        } else {
            System.out.println("Contact not found");
        }

    }
}
