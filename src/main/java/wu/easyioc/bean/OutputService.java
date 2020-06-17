package wu.easyioc.bean;

import lombok.Setter;

/**
 * @author wmxing97
 * @date 2020/6/17 20:20
 */
public class OutputService {

    @Setter
    private HelloWorldService helloWorldService;


    public void output(String text) {
        if (helloWorldService != null) {
            System.out.println(text);
        }
    }

}
