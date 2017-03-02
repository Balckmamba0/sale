package com.ws.business.properties;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by bbtree on 2017/3/2.
 */
public class PropertiesUtils {

    private static Properties properties = new Properties();

    public static Properties getInstance(){
        return properties;
    }

    public static String getProperties(String key){
        return properties.getProperty(key);
    }

    private PropertiesUtils() {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("conf/system.properties");
        try {
            if (inputStream != null) {
                properties.load(new InputStreamReader(inputStream, "UTF-8"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private PropertiesUtils(String fileUrl) {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(fileUrl);
        try {
            if (inputStream != null) {
                properties.load(new InputStreamReader(inputStream, "UTF-8"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
