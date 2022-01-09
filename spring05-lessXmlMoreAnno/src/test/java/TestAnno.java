import com.hua.spring05.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext");
        User user = context.getBean("user", User.class);

        System.out.println(user.getName());
        System.out.println(user.getAge());
    }
}
