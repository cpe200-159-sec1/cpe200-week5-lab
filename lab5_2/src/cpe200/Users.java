package cpe200;


import java.util.ArrayList;
public class Users {
    private ArrayList<User> userList;

    public Users()
    {
        userList=new ArrayList<>();
    }
    public void addUser(User user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        User temp=new User(userName,password);
        userList.add(temp);
    }

    public void deleteUser(User user)throws RuntimeException {
        if(!exists(user)||userList.size()==0)
        {
            throw new RuntimeException();
        }
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i) == user) {
                userList.remove(i);
            }
        }
    }

    public boolean exists(User user)
    {
        for(int i=0;i<userList.size();i++)
        {
            if(userList.get(i)==user)
            {
                return true;
            }
        }
        return false;
    }

    public boolean usernameExists(String username)
    {
        for(int i=0;i<userList.size();i++)
        {
            if(userList.get(i).getUserName()==username)
            {
                return true;
            }
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        for(int i=0;i<userList.size();i++)
        {
            if(userList.get(i).getUserName()==userName)
            {
                return userList.get(i);
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
        return userList.toArray(new User[0]);
    }
}