package wu.easyioc.bean;

import lombok.Setter;

/**
 * @author wmxing97
 * @date 2020/6/8 14:56
 */
public class HelloWorldService {

    @Setter
    private String text;

    @Setter
    private OutputService outputService;

    public void helloWorld() {
        outputService.output(text);
    }

}
