import com.hua.spring02.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {
    @Test
    public void testS() {
        ApplicationContext context = new ClassPathXmlApplicationContext("scope.xml");
        User user1 = context.getBean("user3", User.class);
        User user2 = context.getBean("user3", User.class);
        System.out.println(user1.hashCode() == user2.hashCode()); // true

        User user3 = context.getBean("user4", User.class);
        User user4 = context.getBean("user4", User.class);
        System.out.println(user3.hashCode() == user4.hashCode());  // false
    }
}
