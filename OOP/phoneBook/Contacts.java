package phoneBook;

public class Contacts {
    private String firstName;
    private String lastName;
    private String phoneNo;
    private String email;
    private String bDay;

    public Contacts(){
    }
    public Contacts(String firstName, String lastName, String phoneNo, String email, String bDay){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.email = email;
        this.bDay = bDay;
    }
    public void updateFirstName(String firstName){
        this.firstName = firstName;
    }
    public void updateLastName(String lastName) {
        this.lastName = lastName;
    }
    public void updateEmail(String mail) {
        this.email = email;
    }
    public void updatePhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public String getDate() {
        return bDay;
    }



    public String getEmail() {
        return email;
    }

}
