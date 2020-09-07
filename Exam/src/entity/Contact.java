package entity;

public class Contact {
    private String phoneNumber;
    private String group;
    private String lastName;
    private String firstName;
    private String fullName;
    private String gender;
    private String address;
    private String dob;
    private String email;

    public Contact() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setFullName(String firstName, String lastName) {
        this.fullName = firstName + " " + lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    @Override
//    public int compareTo(Contact o) {
//        if (o.getName().equals(this.getName())) {
//            return 0;
//        } else {
//            return -1;
//        }
//    }

    @Override
    public String toString() {
        return
                "Phone number: " + phoneNumber +
                        ", Group: " + group +
                        ", Name: " + firstName + " " + lastName +
                        ", Gender: " + gender +
                        ", Address: " + address +
                        ", DOB: " + dob +
                        ", Email: " + email + ".";
    }
}
