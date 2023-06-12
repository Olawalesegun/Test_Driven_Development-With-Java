package phoneBook;

public class Contacts {
    private String firstName;
    private String lastName;
    private String phoneNo;
    private String email;
    private String bDay;

    public Contacts(){
    }
    public void createContact(String firstName, String lastName, String phoneNo, String email, String bDay){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.email = email;
        this.bDay = bDay;
    }
    public void updateFirstName(String firstName){

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
}
