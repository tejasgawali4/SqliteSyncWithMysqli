package in.techdrop.sqlitesyncwithmysqli;

/**
 * Created by Carl_johnson on 23-06-2017.
 */

public class Employee
{

    String FirstName;
    String LastName;
    String Address;
    String Mobile ;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }
}
