import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {


    public static void main(String[] args) {


       System.setProperty("webdriver.chrome.driver", "C:/Selenium/ChromeDriver/chromedriver.exe/");

       WebDriver driver = new ChromeDriver();

       driver.get("https://www.gittigidiyor.com/");

       driver.manage().window().maximize();



    driver.findElement(By.xpath("//div[text()='Giriş Yap']")).click();

    driver.get("https://www.gittigidiyor.com/uye-girisi?s=1");

    String email = "betulk2323@gmail.com";

    WebElement kullanici = driver.findElement(By.cssSelector("#L-UserNameField"));
    kullanici.sendKeys(email);

    String password = "betulkoc23";
    WebElement sifre = driver.findElement(By.cssSelector("#L-PasswordField"));
    sifre.sendKeys(password);

    WebElement pass = driver.findElement(By.cssSelector("#gg-login-enter"));
    pass.click();

    String message = "Hesabım";


        WebElement searchBox = driver.findElement(By.cssSelector("input[data-cy='header-search-input']"));
        searchBox.click();
        searchBox.sendKeys("Bilgisayar");







    }
}
