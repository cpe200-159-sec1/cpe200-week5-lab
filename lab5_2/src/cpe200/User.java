package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User(){
    }

    public User(String user, String pwd) {
        setUserName(user);
        setPassword(pwd);
    }

    public String setUserName(String name) {
        String rexUser ="^[a-zA-Z][A-Za-z0-9]{7,}$";
        String tmp = userName;
        if(name.matches(rexUser)) {
            this.userName = name;
            return tmp;
        }throw new RuntimeException("Username Empty or Error");
    }

    public int setPassword(String name) {
        String rexPass ="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}$";
        if(name.matches(rexPass)){
            this.password = name;
            return password.length();
        }throw new RuntimeException("Password worng");
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return password;
    }
}
