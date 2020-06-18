package wu.easyioc.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wmxing97
 * @date 2020/6/8 17:29
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public PropertyValues() {
    }

    public void addPropertyValue(PropertyValue propertyValue) {
        this.propertyValueList.add(propertyValue);
    }

    public List<PropertyValue> getPropertyValues() {
        return this.propertyValueList;
    }

}
