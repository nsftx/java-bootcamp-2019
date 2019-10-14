package ba.spark.bootcamp.UnitTests;


import ba.spark.bootcamp.unitTests.User;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void shouldGetUsersFirstName() {
        User user = new User("Ana", "Kralj");

        String userName = user.getFirstName();

        Assert.assertEquals("Ana", userName);
    }

    @Test
    public void shouldGetWrongUsersFirstName() {
        User user = new User("Ana", "Kralj");

        String userName = user.getFirstName();

        Assert.assertEquals("Luka", userName);
    }
}
