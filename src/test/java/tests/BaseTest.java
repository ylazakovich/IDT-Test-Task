package tests;

import framework.BaseEntity;
import framework.utils.PropertyReader;
import model.User;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest extends BaseEntity {
    protected User user;

    @BeforeClass
    public void setParam(){
        user = new User(PropertyReader.getProperty("username"), PropertyReader.getProperty("password"));
    }
}
