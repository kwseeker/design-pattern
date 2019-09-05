package top.kwseeker.pattern.proxy2.target;

public class UserServiceImpl implements UserService {

    @Override
    public void saveUser() {
        System.out.println("save user info to db");
    }

    @Override
    public void selectAllUser() {
        System.out.println("select all user info from db");
    }
}
