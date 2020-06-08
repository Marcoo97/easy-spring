package wu.easyioc.factory;

import wu.easyioc.BeanDefinition;

/**
 * @author wmxing97
 * @date 2020/6/8 16:06
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) {
        try {
            return beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
