public class person {

    private String name;
    private String address;
    private String phone;
    private String email;
//default constructor
    public person() {
        this("unknown","unknown","unknown","unknown");
    }
    //contruct object with specified details of a person
    public person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
//return the details of person
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    //set the details of a person
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    //return the string discription of the class
    public String toString() {
        return "\nName: " + name + "\nAddress: " + address +
                "\nPhone number: " + phone + "\nEmail address: " + email;

    }
}
