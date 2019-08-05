package examples.aaronhoskins.com.mvvmexample.model.datasource.remote.mockauthenticationhelper;

import java.util.ArrayList;

import examples.aaronhoskins.com.mvvmexample.model.user.User;

public class MockAuthenicationHelper {

    public static User getAuthenication(User passedUser) {
        ArrayList<User> mockUsers = new ArrayList<>();
        mockUsers.add(new User("user", "password", "email@domain.com"));

        if(mockUsers.get(0).getUserName().equals(passedUser.getUserName())
                && mockUsers.get(0).getPassword().equals(passedUser.getPassword())){
            return passedUser;
        } else {
            return null;
        }
    }
}
