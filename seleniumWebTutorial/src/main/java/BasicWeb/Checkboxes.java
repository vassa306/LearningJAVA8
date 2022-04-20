package BasicWeb;

import Actions.TestActions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class Checkboxes extends TestActions {
    @BeforeMethod
    public void setUp(){
        commonSetupCheckbox();
    }

    @Test
    public void handleCheckboxes() throws IOException {
        tickCheckboxes();
    }

    @AfterMethod
    public void tearUp(){
        driver.close();
        driver.quit();
    }
}
