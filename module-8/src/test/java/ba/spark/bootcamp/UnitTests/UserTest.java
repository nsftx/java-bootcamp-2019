package ba.spark.bootcamp.UnitTests;


import ba.spark.bootcamp.unitTests.User;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void shouldGetUsersFirstName(){
        User user = new User("Ana", "Kralj");

        Assert.assertEquals("Ana", user.getFirstName());
    }

    @Test
    public void shouldGetWrongUsersFirstName(){
        User user = new User("Ana", "Kralj");

        Assert.assertEquals("Luka", user.getFirstName());
    }
}
