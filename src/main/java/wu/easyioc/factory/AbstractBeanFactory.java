package wu.easyioc.factory;

import wu.easyioc.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wmxing97
 * @date 2020/6/8 15:57
 */
public abstract class AbstractBeanFactory implements BeanFactory {

    private Map<String, BeanDefinition> beanMap = new ConcurrentHashMap<>();

    @Override
    public Object getBean(String name) {
        return beanMap.get(name).getBean();
    }

    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        Object bean = doCreateBean(beanDefinition);
        beanDefinition.setBean(bean);
        beanMap.put(name, beanDefinition);
    }

    /**
     * 初始化 Bean
     *
     * @param beanDefinition
     * @return
     */
    protected abstract Object doCreateBean(BeanDefinition beanDefinition);
}
