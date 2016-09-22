package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User() {
    }
    public User(String name, String password){
        this.setUserName(name);
        this.setPassword(password);
    }

    public String setUserName(String name) {
        String regx = "^[A-Za-z][A-Za-z0-9]{7,}$";
        if (!name.matches(regx) || "".equals(name)){
            throw new RuntimeException("Name is invalid.");

        }
        try {
            String exName = this.userName;
            this.userName = name;
            return exName;
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            System.out.println("It's time to say GoodBye.");
        }
        return null;
    }

    public int setPassword(String name) {
        String regx = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}$";
        if (!name.matches(regx) || "".equals(name)){
            throw new RuntimeException("Password is invalid.");
        }
        try {
            this.password = name;
            return this.password.length();
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            System.out.println("It's time to say GoodBye.");
        }
        return 0;
    }

    public String getUserName() {

        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }
}
