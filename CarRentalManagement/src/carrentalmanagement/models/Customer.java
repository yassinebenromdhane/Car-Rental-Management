
package carrentalmanagement.models;


public class Customer extends Personne{
    
    int age;

    public Customer() {
    }

    public Customer( int id, String name, String lastName , int age) {
        super(id, name, lastName);
        this.age = age;
    }
   

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer{");
        sb.append("age=").append(age);
        sb.append('}');
        return sb.toString();
    }

   
    
}
