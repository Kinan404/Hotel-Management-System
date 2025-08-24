
package MainClasses;


public class User extends Person {
    private final String Username;
    private String Password;
    private String Phonenumber;
    private String Mail;    

    public User(String Username, String Password, String Phonenumber, String Mail) {
        this.Username = Username;
        this.Password = Password;
        this.Phonenumber = Phonenumber;
        this.Mail = Mail;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public String getMail() {
        return Mail;
    }

    public String getFullname() {
        return Fullname;
    }



    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setPhonenumber(String Phonenumber) {
        this.Phonenumber = Phonenumber;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }
}
