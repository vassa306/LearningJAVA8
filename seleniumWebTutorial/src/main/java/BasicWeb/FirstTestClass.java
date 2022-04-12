package BasicWeb;

import Actions.TestActions;
import org.testng.*;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class FirstTestClass extends TestActions{

    @BeforeMethod
    public void setUp() {
    commonSetup();
    }

    @Test(priority = 1)
    public void getLinks() throws InterruptedException {
    getPageLink(driver);
    driver.close();
    }

    @Test(priority = 2)
    public void invalidPassFb(){
        invalidPassword(driver);
        driver.close();
    }

    @Test(priority = 3)
    public void invalidLoginFb(){
        invalidLogin(driver);
        driver.close();
    }

    @Test(priority = 4)
    public void getPageLinks(){
        getAllLinks(driver);
    }
    @Test(priority = 5)
    public void getFooterLink(){
        getLinksFromFooter(driver);
    }

    @AfterMethod
    public void exitTests(){
        tearUp();
    }



    public void main(String[] args) throws InterruptedException, IOException {

        Properties prop = new Properties();
        try (FileInputStream file = new FileInputStream("C:\\devops\\Test_JAVA\\seleniumWebTutorial\\src\\main\\java\\config\\object.properties")) {
            prop.load(file);
            System.out.println(prop.getProperty("login"));
            System.out.println(prop.getProperty("password"));
        }



        }


    }















