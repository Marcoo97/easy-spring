package wu.easyioc;

import org.junit.Test;
import wu.easyioc.beans.bean.HelloWorldService;
import wu.easyioc.context.ApplicationContext;
import wu.easyioc.context.ClassPathXmlApplicationContext;

/**
 * @author wmxing97
 * @date 2020/6/18 17:05
 */
public class ApplicationContextTest {

    @Test
    public void test() throws Exception {
        // 1. 载入 xml 配置
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tinyioc.xml");
        // 2. 获取 bean
        HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
        // 3. 执行方法
        helloWorldService.helloWorld();
    }

    //TODO: 1. 支持注解的IoC     2. AOP的实现

}
