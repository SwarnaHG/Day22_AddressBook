package AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.String;

public class AddressBookUC2 {
    static ContactDetails person = new ContactDetails();
    /**
     * Creating a List of ContactDetails of type String using ArrayList here Adding
     * new elements in the List
     */
    static List<ContactDetails> contactDetailsList = new ArrayList();

    /**
     * created method addNewContact() to create a new contacts to the AddressBook
     */
    public static void addNewContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String firstName = scanner.next();
        System.out.println("Enter Last Name : ");
        String lastName = scanner.next();
        System.out.println("Enter Your Address : ");
        String address = scanner.next();
        System.out.println("Enter Your City : ");
        String city = scanner.next();
        System.out.println("Enter Your State");
        String state = scanner.next();
        System.out.println("Enter ZipCode : ");
        int zipCode = scanner.nextInt();
        System.out.println("Enter MobileNumber : ");
        long mobileNumber = scanner.nextLong();
        System.out.println("Enter your EmailId  : ");
        String emailId = scanner.next();
        scanner.close();

        person = new ContactDetails(firstName, lastName, address, city, state, zipCode, mobileNumber, emailId);
        contactDetailsList.add(person);
        printContact();

    }

    /**
     * created method printContact() to display the data
     */
    public static void printContact() {
        for (int i = 0; i < contactDetailsList.size(); i++) {
            person = contactDetailsList.get(i);
            System.out.println("Contact Details");
            System.out.println("Name          : " + person.getFirstName() + " " + person.getLastName() + "\n"
                    + "Address       : " + person.getAddress() + "\n" + "City          : " + person.getCity() + "\n"
                    + "State         : " + person.getState() + "\n" + "ZipCode       : " + person.getZipCode() + "\n"
                    + "MobileNumber  : " + person.getMobileNumber() + "\n" + "EmailId       : " + person.getEmailId()
                    + "\n");
        }
    }

    /**
     * Main method for manipulation AddressBookCollection
     *
     * @param args - Default Java param (Not used)
     */
    public static void main(String[] args) {
        /**
         * calling method addNewContact()
         */
        addNewContact();
    }

}
