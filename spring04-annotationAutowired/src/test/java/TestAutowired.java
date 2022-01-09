import com.hua.spring04.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowired {
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext");
        People p1 = context.getBean("people1", People.class);

        p1.getDog().shout();
        p1.getCat().shout();
    }

}
