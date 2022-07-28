package AddressBook;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBook{
    ContactDetails person = new ContactDetails();
    List<ContactDetails> contactDetailsList = new ArrayList<>();
    public void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of contacts.");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {


            System.out.println("Enter the first name);
            String fName = scanner.next();
            if (fName.equals(person.getFirstName())) {
                System.out.println("The name already exists.Enter new name");
            } else {
                System.out.println("Enter the contact details");
                writeContact();
                System.out.println("Successfully added");
            }
        }
    }


    public void writeContact() {
        Scanner scanner = new Scanner(System.in);
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


    public void searchByName(String name) {
        List<ContactDetails> collect = contactDetailsList.stream().filter(p -> p.getFirstName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
        for (ContactDetails contact : collect) {
            System.out.println("Search result for name: " + contact);
        }
    }


    public void searchByCity(String city) {
        List<ContactDetails> collect = contactDetailsList.stream().filter(p -> p.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
        for (ContactDetails contact : collect) {
            System.out.println("Search result for city: " + contact);
        }
    }

    public void searchByState(String state) {
        List<ContactDetails> collect = contactDetailsList.stream().filter(p -> p.getCity().equalsIgnoreCase(state))
                .collect(Collectors.toList());
        for (ContactDetails contact : collect) {
            System.out.println("Search result by state: " + contact);
        }
    }


    public void editContact() {
        System.out.println("Enter firstname of contact you want edit");
        Scanner scanner = new Scanner(System.in);
        String editName = scanner.next();
        boolean edited;
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
            System.out.println("Incorrect name");
        }
    }
    public void deleteContact() {
        System.out.println("Enter the first name of contact that need to be deleted");
        Scanner scanner = new Scanner(System.in);
        String deleteName = scanner.next();
        for (int i = 0; i < contactDetailsList.size(); i++) {
            if (deleteName.equalsIgnoreCase(contactDetailsList.get(i).getFirstName())) {
                contactDetailsList.remove(i);
                System.out.println("contact deleted successfully");
            } else {
                System.out.println("The name does not exist");
            }
        }
    }

        public void searchByOptions() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter\n 1. By name\n 2. By city\n 3. By state\n 4. for previous menu");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    searchByName(name);
                    break;
                case 2:
                    System.out.println("Enter city: ");
                    String city = scanner.nextLine();
                    searchByCity(city);
                    break;
                case 3:
                    System.out.println("Enter state: ");
                    String state = scanner.nextLine();
                    System.out.println(state);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Incorrect choice.. Please enter correct choice");
            }
        }
    }


}
