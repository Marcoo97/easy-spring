package wu.easyioc.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author wmxing97
 * @date 2020/6/17 18:23
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
