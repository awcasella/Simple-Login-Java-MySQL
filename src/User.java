
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="login")
public class User {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="username")
    private String username;
    
    @Column(name="email")
    private String email;
    
    @Column(name="password")
    private String password;
    
    @Column(name="fname")
    private String firstName;
    
    @Column(name="lname")
    private String lastName;
    
    public User(){
        
    }
    
    public User(String username, String email, String password, String firstName, String lastName){
        this.username = username;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
       
}
