package examples.aaronhoskins.com.mvvmexample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import examples.aaronhoskins.com.mvvmexample.model.datasource.remote.mockauthenticationhelper.MockAuthenicationHelper;
import examples.aaronhoskins.com.mvvmexample.model.user.User;

public class MockAuthenicationHelperTest {

    User user;
    @Before
    public void setup() {
        user = new User();
    }

    @Test
    public void getAuthenicationPassedTest() {
        user.setUserName("user");
        user.setPassword("password");
        Assert.assertEquals(MockAuthenicationHelper.getAuthenication(user), user);
    }

    @Test
    public void getAuthenicationFailedTest() {
        user.setUserName("userOne");
        user.setPassword("password");
        Assert.assertEquals(MockAuthenicationHelper.getAuthenication(user), null);
    }
}
