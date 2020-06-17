package wu.easyioc;

import wu.easyioc.io.ResourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wmxing97
 * @date 2020/6/17 18:25
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private Map<String,BeanDefinition> registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(ResourceLoader resourceLoader) {
        this.registry = new HashMap<String, BeanDefinition>();
        this.resourceLoader = resourceLoader;
    }

    public Map<String, BeanDefinition> getRegistry() {
        return registry;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }


}
