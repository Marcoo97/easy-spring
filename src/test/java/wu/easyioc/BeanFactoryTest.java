package wu.easyioc;

import org.junit.Test;
import wu.easyioc.bean.HelloWorldService;
import wu.easyioc.factory.AutowireCapableBeanFactory;
import wu.easyioc.factory.BeanFactory;
import wu.easyioc.io.ResourceLoader;
import wu.easyioc.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * @author wmxing97
 * @date 2020/6/8 14:56
 */
public class BeanFactoryTest {

    @Test
    public void test() throws Exception {
        // 1.读取配置
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");

        // 2.初始化BeanFactory并注册bean
        BeanFactory beanFactory = new AutowireCapableBeanFactory();
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }

        // 3.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();

    }

}
