package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {

    public String userName ;
    public String password ;

    public String userNameForm = "^[a-zA-Z][a-zA-Z0-9]{7,}$";
    public String passwordForm= "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}$" ;

    public User() {
        this.userName = null;
        this.password = null;
    }

    public String setUserName(String name) {
        if(name.equals("")||name == null ||!name.matches(userNameForm)) {
            throw new RuntimeException("username can't use or don't have username");
        }
            String UserName_Before = userName;
            userName = name;

            return UserName_Before;

    }

    public int setPassword(String name) {
        if (name.equals("") || name == null || !name.matches(passwordForm)) {

            throw new RuntimeException("wrong password");
        }

            password = name ;

            return password.length();

    }

    public String getUserName() {

        return userName ;
    }

    public String getPassword() {

        return password ;
    }
}
