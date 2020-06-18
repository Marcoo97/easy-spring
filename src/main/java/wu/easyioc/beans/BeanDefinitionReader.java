package wu.easyioc.beans;

/**
 * @author wmxing97
 * @date 2020/6/17 18:25
 */
public interface BeanDefinitionReader {

    void loadBeanDefinitions(String location) throws Exception;

}
