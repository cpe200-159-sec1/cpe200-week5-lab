package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;

    public User()
    {
        userName = "";
        password = "";
    }

    public User(String userName, String password) {

        this.userName = userName;
        this.password = password;
    }

    public String setUserName(String name)
    {

        String re = "^[A-Za-z][A-Za-z0-9]{7,}$";
        if(name.matches(re)){
            String n = userName;
            userName = name;
            if(n.length() <= 0){
                return null;
            }
            return n;
        }

        else throw  new  RuntimeException();
    }

    public int setPassword(String name)
    {
        /* your code here */
        String re = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}$";
        if(name.matches(re)){
            password = name;
            return name.length();
        }
        else throw  new  RuntimeException();

    }

    public String getUserName()
    {
        /* your code here */

        return userName;
    }

    public String getPassword()
    {
        /* your code here */
        return password;
    }
}
