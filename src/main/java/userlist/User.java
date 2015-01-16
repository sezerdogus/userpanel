package userlist;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	@Id
    private String id;
    private String name;
    private String surname;	
    private String phoneNo;
    private boolean isUser;
    
    public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	} 
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getphoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public boolean isUser() {
        return isUser;
    }
    public void setUser(boolean isUser) {
        this.isUser = isUser;
    }
}
