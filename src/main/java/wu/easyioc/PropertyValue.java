package wu.easyioc;

import lombok.Getter;

/**
 * @author wmxing97
 * @date 2020/6/8 17:24
 */
public class PropertyValue {

    @Getter
    private final String name;
    @Getter
    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

}
