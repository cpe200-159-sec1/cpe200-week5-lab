package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<User> userList;

    public Users()
    {
        userList = new ArrayList<User>();
    }

    public void addUser(User user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        User newUser = new User(userName, password);
        userList.add(newUser);
    }

    public void deleteUser(User user)
    {
        if(!exists(user))
        {
            throw new RuntimeException("User not found");
        }
        userList.remove(user);
    }

    public boolean exists(User user)
    {
        for(User u : userList)
        {
            if(u.equals(user))
            {
                return true;
            }
        }
        return false;
    }

    public boolean usernameExists(String username)
    {
        for(User u : userList)
        {
            if(u.getUserName().equals(username))
            {
                return true;
            }
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        for(User u : userList)
        {
            if(u.getUserName().equals(userName))
            {
                return u;
            }
        }
        return null;
    }

    public int count()
    {
        return userList.size();
    }

    public User[] getUserArray()
    {
        return userList.toArray(new User[count()]);
    }
}
