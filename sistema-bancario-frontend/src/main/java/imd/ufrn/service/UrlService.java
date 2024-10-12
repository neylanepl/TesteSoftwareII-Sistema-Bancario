package imd.ufrn.service;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class UrlService {
    public URLConnection createConnection(URL url) throws IOException{
        return url.openConnection();
    }
}
