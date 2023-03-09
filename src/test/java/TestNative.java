import config.BaseClass;
import org.junit.Test;
import pages.SettingObject;

public class TestNative extends BaseClass {
    static SettingObject settingObject;

    @Test
    public void bTestNative() {
        settingObject = new SettingObject(driver);
        preSettings();
    }

    private static void preSettings() {
        settingObject.selectTimeFormat(false);
        settingObject.checkNotificationToggle(true);
    }

}
