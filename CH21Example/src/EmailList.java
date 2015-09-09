
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import model.Users;

@ManagedBean
@RequestScoped
public class EmailList {
    private Users user;
    private String message;
    
    public EmailList() {
    }
    
    @PostConstruct
    public void init() {
        user = new Users();
    }
    
    public String addToEmailList() {
    	System.out.println("Exists: " + UserDB.emailExists(user.getEmail()));
        if (UserDB.emailExists(user.getEmail())==true) {
        	System.out.println("In if statement");
            message = "This email address already exists. " +
                    "Please enter another email address";
            String a= "index";
            System.out.println(a);
            return a;
        } else {
        	System.out.println("In else statement");
            UserDB.insert(user);
            return "thanks";
        }
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }
}