package carrentalmanagement.models;


public class Admin extends Personne{
    private String email;
    private String password;

    public Admin(int id, String name, String lastName , String email, String password) {
        super(id, name, lastName);
        this.email = email;
        this.password = password;
    }

    public Admin() {
        
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" + "email=" + email + ", password=" + password + '}';
    }
}
