import com.hua.spring10.mapper.UserMapper;
import com.hua.spring10.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestTransaction {

    @Test
    public void testSelect() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);
        List<User> users = mapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testInsert() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);

        User user = new User(6, "wuwuwu", 18);

        mapper.addUser(user);
    }

    @Test
    public void testTrans() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);

        User user = new User(6, "wuwuwu", 18);

        mapper.addAndSelect(user);

    }
}
