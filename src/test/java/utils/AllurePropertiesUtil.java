package utils;

import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class AllurePropertiesUtil {

    private static final Logger logger = LogManager.getLogger(AllurePropertiesUtil.class);

    public static void create() {

        FileOutputStream fos = null;

        try {
            Properties props = new Properties();
            fos = new FileOutputStream("target/allure-results/environment.properties");


            if (System.getenv("BUILD_URL") != null) {
                props.setProperty("Jenkins build URL", System.getenv("BUILD_URL"));
            }

            props.store(fos, "See https://github.com/allure-framework/allure-core/wiki/Environment");

            fos.close();
        } catch (IOException e) {
            logger.error("IO problem when writing allure properties file", e);
        } finally {
            IOUtils.closeQuietly(fos);
        }
    }

    public static void attachScreenshot(WebDriver driver) {
    }
}



