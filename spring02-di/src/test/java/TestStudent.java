import com.hua.spring02.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext");
        Student stu = (Student) context.getBean("student");
        System.out.println(stu.getName());
        System.out.println(stu.toString());
    }
}
