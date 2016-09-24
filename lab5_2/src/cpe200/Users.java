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
        User node = new User();
        node.setUserName(userName);
        node.setPassword(password);

        userList.add(node);
    }

    public void deleteUser(User user)
    {
        if (exists(user))
            userList.remove(user);
        else throw new RuntimeException("Error");
    }

    public boolean exists(User user)
    {
        return userList.contains(user);
    }

    public boolean usernameExists(String username)
    {
        for (User i : userList) {
            if (i.getUserName().equals(username))
                return true;
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        for (User i : userList) {
            if (i.getUserName().equals(userName))
                return i;
        }
        return null;
    }

    public int count()
    {
        return userList.size();
    }

    public User[] getUserArray()
    {
        return userList.toArray(new User[1]);
    }
}
