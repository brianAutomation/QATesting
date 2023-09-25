package PracticeJAVA;

public class User {
    private String firstName;
    private String lastname;
    private String address;
    private String email;

    public User(){
        super();
    }
    public User(String firstName, String lastName, String address, String email){
        super();
        this.firstName = firstName;
        this.lastname = lastName;
        this.address = address;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
