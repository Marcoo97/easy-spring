package wu.easyioc.factory;

import wu.easyioc.BeanDefinition;

/**
 * @author wmxing97
 * @date 2020/6/8 15:56
 */
public interface BeanFactory {

    Object getBean(String name) throws Exception;

    void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;

}
