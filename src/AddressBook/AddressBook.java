package AddressBook;

public class AddressBook {
    private class Contact{
        String firstName, lastNmae, address, city, state, emailId;
        int zipCode;
        long mobileNumber;
    }

    /**
     * created method printContact for creating contacts in AddressBook
     */
    public void printContact() {
        Contact person = new Contact();
        person.firstName = "Swarna";
        person.lastNmae = "HG";
        person.address = "BTM LAYOUT";
        person.city = "Bangalore";
        person.state = "Karnataka";
        person.zipCode = 577206;
        person.mobileNumber = 9113919512L;
        person.emailId = "swarnahg18@gmail.com";
        System.out.println("Contact Details");
        System.out.println("Name: " + person.firstName + " " + person.lastNmae + "\n" + "Address: "
                + person.address + "\n" + "City: " + person.city + "\n" + "State: " + person.state
                + "\n" + "ZipCode: " + person.zipCode + "\n" + "Mobile Number: " + person.mobileNumber + "\n"
                + "EmailId: " + person.emailId + "\n");
    }


    public static void main(String[] args) {

         //instance of AddressBook class

        AddressBook addressBook = new AddressBook();

         //DisplayContact

        addressBook.printContact();

    }


}
