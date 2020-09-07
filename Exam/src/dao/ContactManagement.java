package dao;

import entity.Contact;

import java.util.*;

public class ContactManagement implements  ContactManagementDAO{
    private Contact contact = new Contact();
    Scanner scanner = new Scanner(System.in);
    public  static FileUtil file = new FileUtil();
    public static HashMap<String, Contact> contacts = new HashMap<String, Contact>();
    public static Regex validate = new Regex();

    @Override
    public void viewContract() {
        contacts = file.getContacts();
        String line =
                "+----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+";
        String lineHeader =
                "+========================================================================================================================================================================================+";
        String header =
                "| Contact Name                 | Phone Number | Group        | Gender       | Address                                              | DOB                | Email                          |";
        System.out.println("Contact:");
        System.out.println(lineHeader);
        System.out.println(header);
        System.out.println(lineHeader);
        List<String> sortedList = new ArrayList<>(contacts.keySet());
        Collections.sort(sortedList);
        String phoneNumber, group, name, gender, address, dob, email;
        int stop = 5;
        for (int i = stop-5; i<stop; i++) {
            String key = sortedList.get(i);
            Contact temp = contacts.get(key);
            phoneNumber = temp.getPhoneNumber();
            group = temp.getGroup();
            name = temp.getFullName();
            gender = temp.getGender();
            address = temp.getAddress();
            dob = temp.getDob();
            email = temp.getEmail();
        }
//        for (String item: sortedList) {
//            Contact temp = contacts.get(item);
//            phoneNumber = temp.getPhoneNumber();
//            group = temp.getGroup();
//            name = temp.getFullName();
//            gender = temp.getGender();
//            address = temp.getAddress();
//            dob = temp.getDob();
//            email = temp.getEmail();
//            System.out.format("| %-29s", name);
//            System.out.format("| %-13s", phoneNumber);
//            System.out.format("| %-13s", group);
//            System.out.format("| %-13s", gender);
//            System.out.format("| %-53s", address);
//            System.out.format("| %-19s", dob);
//            System.out.format("| %-31s|", email);
//            System.out.println();
//            System.out.println(line);
//        }
    }

    @Override
    public void add() {
        contacts = file.getContacts();
        Contact newContact = new Contact();
        System.out.println("Please create new phone number");
        String phoneNumber = scanner.nextLine();
        while (!validate.validatePhoneNumber(phoneNumber)) {
            System.out.println("Incorrect phone number. Please input again!");
            phoneNumber = scanner.nextLine();
        }
        newContact.setPhoneNumber(phoneNumber);
        System.out.println("Enter group name");
        newContact.setGroup(scanner.nextLine());
        System.out.println("Enter first name");
        newContact.setFirstName(scanner.nextLine());
        System.out.println("Enter last name");
        String lastName = scanner.nextLine();
        newContact.setLastName(lastName);
        System.out.println("Enter gender");
        String gender = scanner.nextLine();
        while (!validate.validateGender(gender)) {
            System.out.println("Incorrect gender. Please input 'Male' or 'Female'");
            gender = scanner.nextLine();
        }
        newContact.setGender(gender);
        System.out.println("Enter address");
        newContact.setAddress(scanner.nextLine());
        System.out.println("DOB - Enter year:");
        int year = Integer.parseInt(scanner.nextLine());
        while (!validate.validateYear(year)) {
            System.out.println("Incorrect year. Please input again!");
            year = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("DOB - Enter month:");
        int month = Integer.parseInt(scanner.nextLine());
        while (!validate.validateMonth(month)) {
            System.out.println("Incorrect month. Please input again!");
            month = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("DOB - Enter day:");
        int day = Integer.parseInt(scanner.nextLine());
        while (!validate.validateDay(year, month, day)) {
            System.out.println("Incorrect day. Please input again!");
            day = Integer.parseInt(scanner.nextLine());
        }
        String dob = day + "-" + month + "-" + year;
        newContact.setDob(dob);
        System.out.println("Enter email");
        String email = scanner.nextLine();
        while (!validate.validateEmail(email)) {
            System.out.println("Incorrect email. Please input again!");
            email = scanner.nextLine();
        }
        newContact.setEmail(email);
        contacts.put(lastName, newContact);
        file.saveContacts(contacts);
        System.out.println("A new contact had been added\n" +
                "--------------------");

    }

    @Override
    public void editInformation() {
        System.out.println("Please input name");
        String lastName = scanner.nextLine();
        contacts = file.getContacts();
        if (!contacts.containsKey(lastName)) {
            System.out.println("Not found this contact");
        } else {
            Contact contact1 = contacts.get(lastName);
            System.out.println("Name: " + contact1.getPhoneNumber() + ". Do you want to edit?\n" +
                    "Y: Yes\n" + "N: No");
            String selected = scanner.nextLine();
            switch (selected) {
                case "Y":
                    System.out.println("Enter new phone number:");
                    contact1.setPhoneNumber(scanner.nextLine());
                    break;
                case "N":
                    break;
                default:
                    System.out.println("Please press Y or N");
            }
            System.out.println("Group: " + contact1.getGroup() + ". Do you want to edit?\n" +
                    "Y: Yes\n" + "N: No");
            selected = scanner.nextLine();
            switch (selected) {
                case "Y":
                    System.out.println("Enter new group:");
                    contact1.setGroup(scanner.nextLine());
                    break;
                case "N":
                    break;
                default:
                    System.out.println("Please press Y or N");
            }
            System.out.println("First name: " + contact1.getFirstName() + ". Do you want to edit?\n" +
                    "Y: Yes\n" + "N: No");
            selected = scanner.nextLine();
            switch (selected) {
                case "Y":
                    System.out.println("Enter new first name:");
                    contact1.setFirstName(scanner.nextLine());
                    break;
                case "N":
                    break;
                default:
                    System.out.println("Please press Y or N");
            }
            System.out.println("Gender: " + contact1.getGender() + ". Do you want to edit?\n" +
                    "Y: Yes\n" + "N: No");
            selected = scanner.nextLine();
            switch (selected) {
                case "Y":
                    System.out.println("Enter new gender:");
                    contact1.setGender(scanner.nextLine());
                    break;
                case "N":
                    break;
                default:
                    System.out.println("Please press Y or N");
            }
            System.out.println("Address: " + contact1.getAddress() + ". Do you want to edit?\n" +
                    "Y: Yes\n" + "N: No");
            selected = scanner.nextLine();
            switch (selected) {
                case "Y":
                    System.out.println("Enter new address:");
                    contact1.setAddress(scanner.nextLine());
                    break;
                case "N":
                    break;
                default:
                    System.out.println("Please press Y or N");
            }
            System.out.println("DOB: " + contact1.getDob() + ". Do you want to edit?\n" +
                    "Y: Yes\n" + "N: No");
            selected = scanner.nextLine();
            switch (selected) {
                case "Y":
                    System.out.println("DOB - Enter new year:");
                    int year = Integer.parseInt(scanner.nextLine());
                    System.out.println("DOB - Enter new month:");
                    int month = Integer.parseInt(scanner.nextLine());
                    System.out.println("DOB - Enter new day:");
                    int day = Integer.parseInt(scanner.nextLine());
                    String dob = day + "-" + month + "-" + year;
                    contact1.setDob(dob);
                    break;
                case "N":
                    break;
                default:
                    System.out.println("Please press Y or N");
            }
            System.out.println("Email: " + contact1.getEmail() + ". Do you want to edit?\n" +
                    "Y: Yes\n" + "N: No");
            selected = scanner.nextLine();
            switch (selected) {
                case "Y":
                    System.out.println("Enter new email:");
                    contact1.setEmail(scanner.nextLine());
                    break;
                case "N":
                    break;
                default:
                    System.out.println("Please press Y or N");
            }
            contacts.put(lastName, contact1);
            file.saveContacts(contacts);
            System.out.println("Information is updated\n" +
                    "--------------------");
        }
    }

    @Override
    public void delete() {
        System.out.println("Please input name");
        String lastName = scanner.nextLine();
        contacts = file.getContacts();
        if (!contacts.containsKey(lastName)) {
            System.out.println("Not found this contact");
        } else {
            Contact temp = contacts.get(lastName);
            System.out.println("Do you want to delete " + temp.getFullName() + "?\n" +
                    "Y: Yes\n" + "N: No");
            String select = scanner.nextLine();
            switch (select) {
                case "Y":
                    contacts.remove(lastName);
                    System.out.println(temp.getFullName() + " is deleted\n" +
                            "--------------------");
                    break;
                case "N":
                    break;
                default:
                    System.out.println("Please press Y or N");
            }

        }
        file.saveContacts(contacts);
    }

    @Override
    public void search() {
        System.out.println("Please input name");
        String lastName = scanner.nextLine();
        contacts = file.getContacts();
        if (!contacts.containsKey(lastName)) {
            System.out.println("Not found this contact");
        } else {
            Contact contact2 = new Contact();
            contact2 = contacts.get(lastName);
            System.out.println(contact2.toString());
        }
    }

    public void exit() {
        System.exit(0);
    }

    public void saveBackUp() {
        file.saveContacts(contacts);
        System.out.println("Your contact have been saved");
    }

    public void getBackUp() {
        file.getContacts();
        System.out.println("Your contact have been updated");
        viewContract();
    }
}
