package wu.easyioc.factory;

import wu.easyioc.BeanDefinition;
import wu.easyioc.BeanReference;
import wu.easyioc.PropertyValue;

import java.lang.reflect.Field;

/**
 * @author wmxing97
 * @date 2020/6/8 16:06
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        Object bean = createBeanInstance(beanDefinition);
        beanDefinition.setBean(bean);
        applyPropertyValues(bean, beanDefinition);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition) throws Exception {
        return beanDefinition.getBeanClass().newInstance();
    }

    protected void applyPropertyValues(Object bean, BeanDefinition beanDefinition) throws Exception {
        for (PropertyValue propertyValue : beanDefinition.getPropertyValues().getPropertyValues()) {
            // getDeclaredField 获取一个类的指定成员变量
            Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
            // 需要对 private 的成员变量进行set操作，必须setAccessible(true)
            declaredField.setAccessible(true);
            Object value = propertyValue.getValue();
            if (value instanceof BeanReference) {
                BeanReference beanReference = (BeanReference) value;
                value = getBean(beanReference.getName());
            }
            declaredField.set(bean, value);
        }
    }

}
