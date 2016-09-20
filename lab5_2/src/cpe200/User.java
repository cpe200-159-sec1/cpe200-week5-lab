package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User() {
        setUserName("");
        setPassword("");
    }

    public String setUserName(String name)  {
        String A = "[a-zA-Z][A-Za-z0-9]{7,}";
        String oldname = null;
        if ( name != null && !name.equals("")) {
            if (name.matches(A)) {
                oldname = userName;
                userName = name;
            } else {
                throw new RuntimeException("false");
            }
        }
        return oldname;
    }

    public int setPassword(String name) {
        String B = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}";
        if ( name != null && !name.equals("")) {
            if (name.matches(B)) {
                password = name;
            } else
                throw new RuntimeException("false");
        }
        return name.length();
        }



    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }
}
