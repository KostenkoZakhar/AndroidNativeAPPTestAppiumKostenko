package pages;

import config.BaseClass;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;

public class SettingObject {
    String timeFormatToggle = "com.weather.forecast.weatherchannel:id/tg_format_time_setting";
    String notificationToggle = "com.weather.forecast.weatherchannel:id/tgNotifi_settings";

    private static MobileDriver driver;

    public SettingObject(MobileDriver Driver) {
        driver = Driver;
    }

    public void selectTimeFormat(boolean b) {
        MobileElement mobileElement = (MobileElement) driver.findElementByXPath(SettingsField.TIMEFORMAT).findElement(By.id(timeFormatToggle));
        System.out.println(mobileElement.getAttribute("checked"));
        if (!String.valueOf(b).equals(mobileElement.getAttribute("checked"))) {
            mobileElement.click();
        }
    }

    public void checkNotificationToggle(boolean b) {
        MobileElement mobileElement = (MobileElement) driver.findElementByXPath(SettingsField.NOTIFICATION).findElement(By.id(notificationToggle));
        System.out.println(mobileElement.getAttribute("checked"));
        if (!String.valueOf(b).equals(mobileElement.getAttribute("checked"))) {
            mobileElement.click();
        }
    }
}