

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTest {

    @Test(dataProvider = "data")
    public void Test1(String user, String password){
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/");
//        System.out.println(driver.getTitle());
        System.out.println(user+password);
//        driver.quit();
    }

    @DataProvider(name = "data")
    public Object[][] datapro(){
        return new String[][]{
                {"user1", "password1"},
                {"user2", "password2"}
        };
    }
}
