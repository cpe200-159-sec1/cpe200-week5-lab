package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;
    protected String userNamePattern = "^[a-zA-Z][a-zA-Z0-9]{7,}";
    protected String passwordPattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}";

    public User()
    {
        userName = null;
        password = null;
    }

    public User(String name, String pass){
        userName = null;
        password = null;
        setUserName(name);
        setPassword(pass);
    }

    public String setUserName(String name)
    {
        if(name.equals("")||name == null)
            return null;


        if(name.matches(userNamePattern))
        {
            String oldUserName = userName;
            userName = name;
            return oldUserName;
        }
        throw new RuntimeException("Empty or wrong pattern");
    }

    public int setPassword(String name)
    {
        if(name.matches(passwordPattern))
        {
            password = name;
        }
        else
        {
            throw new RuntimeException("Empty or wrong pattern");
        }
        return password.length();
    }

    public String getUserName()
    {
        return userName;
    }

    public String getPassword()
    {
        return password;
    }
}
