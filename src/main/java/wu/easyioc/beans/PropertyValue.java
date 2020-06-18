package wu.easyioc.beans;

import lombok.Data;

/**
 * @author wmxing97
 * @date 2020/6/8 17:24
 */
@Data
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

}
