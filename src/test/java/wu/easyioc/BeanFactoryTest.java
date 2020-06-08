package wu.easyioc;

import org.junit.Test;
import wu.easyioc.factory.AutowireCapableBeanFactory;
import wu.easyioc.factory.BeanFactory;

/**
 * @author wmxing97
 * @date 2020/6/8 14:56
 */
public class BeanFactoryTest {

    @Test
    public void test() throws Exception {
        // 1.初始化BeanFactory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        // 2.注入Bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("wu.easyioc.HelloWorldService");

        // 3.设置属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("text","helloworld from bot..."));
        beanDefinition.setPropertyValues(propertyValues);

        // 4.生成Bean
        beanFactory.registerBeanDefinition("helloworld", beanDefinition);

        // 5.获取Bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloworld");
        helloWorldService.helloworld();

    }

}
