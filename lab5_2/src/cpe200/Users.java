package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    private ArrayList<User> userList;

    public Users(){
        this.userList = new ArrayList<>();
    }
    public void addUser(User user)
    {
        this.userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        this.userList.add(new User(userName,password));
    }

    public void deleteUser(User user)
    {
        if (exists(user)){
            this.userList.remove(user);
        }else{
            throw new RuntimeException("KABOOOOOM");
        }

    }

    public boolean exists(User user)
    {
        return this.userList.contains(user);
    }

    public boolean usernameExists(String username)
    {
        for (User x:userList) {
            if (x.getUserName() == username){
                return true;
            }
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        for (User x:userList) {
            if (x.getUserName() == userName){
                return x;
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
        return userList.toArray(new User[this.count()]);
    }
}
