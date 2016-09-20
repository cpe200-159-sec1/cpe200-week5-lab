package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName=null;
    private String password;

    public User() {
    }
    public User(String userName,String password)
    {
        this.setUserName(userName);
        this.setPassword(password);
    }
    public String setUserName(String name)
    {
        if (name.matches("^[a-zA-Z][a-zA-Z0-9]{7,}$"))
        {
            String temp=userName;
            this.userName = name;
            return temp;
        }
        else
        {
            throw new RuntimeException("ERROR Invalid username");
        }
    }

    public int setPassword(String name)
    {
        if(name.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}$"))
        {
            this.password=name;
            return password.length();
        }
        else
        {
            throw new RuntimeException("ERROR Invalid password");
        }
    }

    public String getUserName() {

        return this.userName;
    }

    public String getPassword()
    {
        return this.password;
    }
}