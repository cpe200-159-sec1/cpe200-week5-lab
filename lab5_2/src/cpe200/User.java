package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User() {
    }

    public User(String name,String password){
        this.userName = name;
        this.password = password;
    }

    public String setUserName(String name) {
        String test1 = "[A-Za-z][\\w\\d]{7,}";
        if(name.matches(test1)){
            String user = this.userName;
            this.userName = name;
            return  user;
        }
        throw new RuntimeException("invalid name is assigned");
    }

    public int setPassword(String name) {
        String test2 = "(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d])[\\w\\d]{12,}";
        if(name.matches(test2)){
            int  pass = name.length();
            this.password = name;
            return  pass;
        }
        throw new RuntimeException("invalid password is assigned");
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}