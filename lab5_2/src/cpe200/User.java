package cpe200;

import javax.naming.NamingEnumeration;

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

    public String setUserName(String name) {
        String Oname = null;
        String a = "[a-zA-Z][A-Za-z0-9]{7,}";
        if(name != null && !name.equals("")){
            if(name.matches(a)){
                Oname = userName;
                userName = name;
            }else
            throw new RuntimeException("ERROR");
        }
        return Oname;
    }

    public int setPassword(String name) {

        String b = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{12,}";
        if(name != null && !name.equals("")){
            if(name.matches(b)){
               password = name;
            }else
            throw new RuntimeException("ERROR");
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
