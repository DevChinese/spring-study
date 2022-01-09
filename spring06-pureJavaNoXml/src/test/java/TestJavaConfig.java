import com.hua.spring06.config.AppConfig;
import com.hua.spring06.pojo.AaBb;
import com.hua.spring06.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJavaConfig {
    @Test
    public void test01() {
        // 如果完全使用了配置类方式去做，我们就只能通过AnnotationConfig上下文来获取容器，通过配置类的class来加载配置
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        User user = context.getBean("user", User.class);
        System.out.println(user.getName());

        User user2 = context.getBean("getUser", User.class);
        System.out.println(user2.getName());

        // 注意：若在config上同时用了@ComponentScan和@Bean，两种方式得到的实例不是同一个
        System.out.println(user.hashCode() == user2.hashCode()); // false

        AaBb ab =  context.getBean("aaBb", AaBb.class);
        System.out.println(ab.getName());
    }
}
