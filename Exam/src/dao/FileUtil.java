package dao;

import entity.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FileUtil {
    private static final String fileName = "contacts.csv";
    private static Contact contact = new Contact();

    public void saveContacts(HashMap<String, Contact> contacts) {
        try {
            File file = new File(fileName);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            List<Contact> listStudent = new ArrayList<>(contacts.values());
            for (Contact item: listStudent) {
                writer.append(item.getPhoneNumber());
                writer.append(",");
                writer.append(item.getGroup());
                writer.append(",");
                writer.append(item.getFirstName());
                writer.append(",");
                writer.append(item.getLastName());
                writer.append(",");
                writer.append(item.getGender());
                writer.append(",");
                writer.append(item.getAddress());
                writer.append(",");
                writer.append(item.getDob());
                writer.append(",");
                writer.append(item.getEmail());
                writer.append("\n");
            }
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public HashMap<String, Contact> getContacts() {
        HashMap<String, Contact> contacts = new HashMap<String, Contact>();
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fileReader = new FileReader(file);
                BufferedReader reader = new BufferedReader(fileReader);
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] temp = line.split(",");
                    Contact contact = new Contact();
                    contact.setPhoneNumber(temp[0]);
                    contact.setGroup(temp[1]);
                    contact.setFirstName(temp[2]);
                    contact.setLastName(temp[3]);
                    contact.setGender(temp[4]);
                    contact.setAddress(temp[5]);
                    contact.setDob(temp[6]);
                    contact.setEmail(temp[7]);
                    contacts.put(temp[3], contact);
                }
                fileReader.close();
            }
        } catch(IOException ex){
            ex.printStackTrace();
        }
        return contacts;
    }
}
