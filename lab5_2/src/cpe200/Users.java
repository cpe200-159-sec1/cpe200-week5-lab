package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    private ArrayList<User> userList = new ArrayList<>();

    public void addUser(User user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        //incase of input is string, so we have to conv it to object first
        User newUser = new User();
        newUser.setUserName(userName);
        newUser.setPassword(password);
        userList.add(newUser);

    }

    public void deleteUser(User user)
    {
        //userList.remove(user);
        if(!userList.remove(user)) {
            throw new RuntimeException();
        }
    }

    public boolean exists(User user)
    {

        if (userList.contains(user)){
        return true;
        }

        return false;
    }

    public boolean usernameExists(String username)
    {
        for (User user : userList) {
            if (user.getUserName().equals(username))
                return true;
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        for (User user : userList) {
            if (user.getUserName().equals(userName))
                return user;
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
