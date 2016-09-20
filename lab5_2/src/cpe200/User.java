package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;


    public String getUserName() {
        return userName;
    }

    public String  setUserName(String name) {
        String tmp = "[A-Za-z][A-Za-z0-9]{7,}";
           if(name.matches(tmp)) {
               String use = userName;
               this.userName = name;
               return use;
           }
        throw new RuntimeException("invalid name is assigned.");
    }

    public String getPassword() {
        return password;
    }

    public int setPassword(String name) {
        String tmp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}$";
        if(name.matches(tmp)) {
            int pass = name.length();
            this.password = name;
            return pass;
        }throw new RuntimeException("invalid password is assigned.");
    }
}
