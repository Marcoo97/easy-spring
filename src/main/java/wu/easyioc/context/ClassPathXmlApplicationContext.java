package wu.easyioc.context;

import wu.easyioc.beans.BeanDefinition;
import wu.easyioc.beans.factory.AbstractBeanFactory;
import wu.easyioc.beans.factory.AutowireCapableBeanFactory;
import wu.easyioc.beans.io.ResourceLoader;
import wu.easyioc.beans.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * @author wmxing97
 * @date 2020/6/18 17:04
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

    private String configLocation;

    public ClassPathXmlApplicationContext(String configLocation) throws Exception {
        this(configLocation, new AutowireCapableBeanFactory());
    }

    public ClassPathXmlApplicationContext(String configLocation, AbstractBeanFactory beanFactory) throws Exception {
        super(beanFactory);
        this.configLocation = configLocation;
        refresh();
    }

    @Override
    public void refresh() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions(configLocation);
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }
    }

}
