package LabTask1Final;

public class Contact {
    String phone;
    String email;

    Contact(String phone , String email){
        this.phone = phone;
        this.email = email;
    }
        public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Phone: " + phone + ", Email: " + email;
    }

}
