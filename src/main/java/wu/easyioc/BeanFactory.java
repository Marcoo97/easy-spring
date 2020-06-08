package wu.easyioc;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器工厂
 *
 * @author wmxing97
 * @date 2020/6/8 14:50
 */
public class BeanFactory {
    private Map<String, BeanDefinition> beanMap = new HashMap<>();

    public Object getBean(String name) {
        return beanMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanMap.put(name, beanDefinition);
    }

}
