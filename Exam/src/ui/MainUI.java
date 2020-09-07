package ui;

import dao.ContactManagement;
import entity.Contact;

import java.util.Scanner;

public class MainUI {
    public static ContactManagement management = new ContactManagement();
    public static Contact contact = new Contact();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showGreeting();
        viewInstruction();
        implement();
    }

    public static void showGreeting() {
        System.out.println("--- CONTACT MANAGEMENT PROGRAM ---");
    }

    public static void viewInstruction() {
        System.out.println("Choose function as below:\n" +
                "1. View all contacts\n" +
                "2. Add new contact\n" +
                "3. Edit a contact\n" +
                "4. Delete a contact\n" +
                "5. Search a contact\n" +
                "6. Get contacts from backup file\n" +
                "7. Save contacts to backup file\n" +
                "8. Exit\n" +
                "--------------------");
    }

    public static void implement() {
        int selected = Integer.parseInt(scanner.nextLine());
        while (selected != 8) {
            switch (selected) {
                case 1:
                    management.viewContract();
                    break;
                case 2:
                    management.add();
                    break;
                case 3:
                    management.editInformation();
                    break;
                case 4:
                    management.delete();
                    break;
                case 5:
                    management.search();
                    break;
                case 6:
                    management.getBackUp();
                    break;
                case 7:
                    management.saveBackUp();
                    break;
                default:
                    System.out.println("Please select as instruction");
            }
            viewInstruction();
            selected = Integer.parseInt(scanner.nextLine());
        }
        if (selected == 8) {
            management.exit();
        }
    }
}
