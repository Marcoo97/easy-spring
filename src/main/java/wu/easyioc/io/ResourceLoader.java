package wu.easyioc.io;

import java.net.URL;

/**
 * @author wmxing97
 * @date 2020/6/17 18:23
 */
public class ResourceLoader {

    public Resource getResource(String location){
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }

}
