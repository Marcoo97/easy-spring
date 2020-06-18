package wu.easyioc.beans.factory;

import wu.easyioc.beans.BeanDefinition;

/**
 * @author wmxing97
 * @date 2020/6/8 15:56
 */
public interface BeanFactory {

    Object getBean(String name) throws Exception;

}
