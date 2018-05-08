package org.n3r.idworker.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Properties;

import static ch.qos.logback.core.util.CloseUtil.closeQuietly;
import static java.io.File.separator;

/**
 * 读取资源文件的工具类
 */
public class Props {

    static Logger log = LoggerFactory.getLogger(Props.class);

    enum Silent {ON, OFF}
    /**
     *
     * @param propertiesFileName
     * @param userHomeBasePath
     * @return
     */
    public static Properties tryProperties(String propertiesFileName, String userHomeBasePath) {
        Properties properties = new Properties();
        InputStream is = null;
        try {
            is = Props.tryResource(propertiesFileName, userHomeBasePath, Silent.ON);
            if (is != null) properties.load(is);
        } catch (IOException e) {
            log.error("load properties error: {}", e.getMessage());
        } finally {
            closeQuietly(is);
        }

        return properties;
    }




    /**
     *
     * @param propertiesFileName
     * @param userHomeBasePath
     * @param silent
     * @return
     */
    public static InputStream tryResource(String propertiesFileName, String userHomeBasePath, Silent silent) {
        InputStream is = currentDirResource(new File(propertiesFileName));
        if (is != null) return is;

        is = userHomeResource(propertiesFileName, userHomeBasePath);
        if (is != null) return is;

        is = classpathResource(propertiesFileName);
        if (is != null || silent == Silent.ON) return is;

        throw new RuntimeException("fail to find " + propertiesFileName + " in current dir or classpath");
    }

    /**
     *
     * @param pathname
     * @param appHome
     * @return
     */
    private static InputStream userHomeResource(String pathname, String appHome) {
        String filePath = System.getProperty("user.home") + separator + appHome;
        File dir = new File(filePath);
        if (!dir.exists()) return null;

        return currentDirResource(new File(dir, pathname));
    }

    /**
     *
     * @param file
     * @return 如果文件存在，返回文件流；否则返回空。
     */
    private static InputStream currentDirResource(File file) {
        if (!file.exists()) return null;

        try {
            return new FileInputStream(file);
        } catch (FileNotFoundException e) {
            // This should not happened
            log.error("read file {} error", file, e);
            return null;
        }
    }

    /**
     *
     * @param resourceName
     * @return 读取资源的输入流
     */
    public static InputStream classpathResource(String resourceName) {
        return Props.class.getClassLoader().getResourceAsStream(resourceName);
    }

}
