package wu.easyioc.bean;

/**
 * @author wmxing97
 * @date 2020/6/8 14:56
 */
public class HelloWorldService {

    private String text;

    public void helloWorld() {
        System.out.println(text);
    }

    public void setText(String text) {
        this.text = text;
    }

}
