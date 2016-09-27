package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<User> userList = new ArrayList<>();

    public void addUser(User user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        User a = new User();
        a.setUserName(userName);
        a.setPassword(password);
    }

    public void deleteUser(User user)
    {
        if (exists(user)){
            userList.remove(user);
        }else {
            throw new RuntimeException();
        }
    }

    public boolean exists(User user)
    {
        if (userList.contains(user)) return true;
        return false;
    }

    public boolean usernameExists(String username)
    {
        for (User i : userList){
            if (i.userName.equals(username)) return true;
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        return null;
    }

    public int count()
    {
        return 0;
    }

    public User[] getUserArray()
    {
        return null;
    }
}
