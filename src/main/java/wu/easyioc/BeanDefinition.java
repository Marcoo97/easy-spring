package wu.easyioc;

import lombok.Getter;
import lombok.Setter;

/**
 * 定义了 bean 的容器
 *
 * @author wmxing97
 * @date 2020/6/8 14:48
 */
public class BeanDefinition {

    @Getter
    @Setter
    private Object bean;

    @Getter
    @Setter
    private Class beanClass;

    @Getter
    private String beanClassName;

    @Getter
    @Setter
    private PropertyValues propertyValues = new PropertyValues();

    public BeanDefinition() {
    }

    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
        try {
            this.beanClass = Class.forName(beanClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
