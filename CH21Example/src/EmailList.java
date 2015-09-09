
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import model.Todolist;
import model.Users;

@ManagedBean
@RequestScoped
public class EmailList {
    private Users user;
    private String message;
    private Todolist list;
    
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
            String a= "thanks";
            System.out.println(a);
            return a;
        } else {
        	System.out.println("In else statement");
            //UserDB.insert(user);
            return "thanks";
        }
    }
    
    public void addToList(Todolist list)
    {
    	UserDB.insertList(list);
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

	public Todolist getList() {
		return list;
	}

	public void setList(Todolist list) {
		this.list = list;
	}
    
}