package ba.spark.bootcamp.UnitTests;


import ba.spark.bootcamp.unitTests.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
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
