package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class UserMethodReg {

    private static final Logger logger = Logger.getLogger(UserMethodReg.class.getName());

    public static final List<UserInfo> usersInfo = new ArrayList<>();
    static UserInfo ui = new UserInfo();



    public static boolean userSignUpCheck(String u, String p) {

        for (UserInfo userInfo : usersInfo) {
            if (u.equals(userInfo.getUsername()) || p.equals(userInfo.getPassword())) {
                logger.info("Enter Valid Information");

                return false;}
        }

        logger.info("Signed Up Successfully");
        addUser(u,p);
            return true;

    }

    public static void addUser(String u, String p){
        ui.setUsername(u);
        ui.setPassword(p);
        usersInfo.add(ui);

    }

    public static boolean userLoginCheck(String username, String password)  {

        for (UserInfo userInfo : usersInfo) {
            if (username.equals(userInfo.getUsername()) && password.equals(userInfo.getPassword())) {
                logger.info("Logged In Successfully");

                return true;
            }
        }
        return false;
    }




}
