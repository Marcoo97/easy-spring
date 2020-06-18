package wu.easyioc.context;

import wu.easyioc.beans.factory.AbstractBeanFactory;

/**
 * @author wmxing97
 * @date 2020/6/18 17:04
 */
public class AbstractApplicationContext implements ApplicationContext {
    protected AbstractBeanFactory beanFactory;

    public AbstractApplicationContext(AbstractBeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public void refresh() throws Exception {}

    @Override
    public Object getBean(String name) throws Exception {
        return beanFactory.getBean(name);
    }

}
