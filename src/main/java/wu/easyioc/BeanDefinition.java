package wu.easyioc;

/**
 * 定义了 bean 的容器
 *
 * @author wmxing97
 * @date 2020/6/8 14:48
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
