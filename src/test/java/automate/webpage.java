package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//drivers//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
        driver.get("https://homeloans.sbi/getcibil");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("RandomFirstName");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("RandomLastName");
        Thread.sleep(1000);
        WebElement dropdown1=driver.findElement(By.xpath("//*[@id='gender']"));
        Select s=new Select(dropdown1);
        s.selectByVisibleText("Male");
        Thread.sleep(1000);
        driver.findElement(By.id("dob")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"mm-7\"]/div/a[1]")).click();
        Thread.sleep(1000);
        WebElement dropdown2=driver.findElement(By.xpath("//*[@id='adress_type']"));
        Select s1=new Select(dropdown2);
        s1.selectByVisibleText("Permanent Address");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("Mysore");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='address2']")).sendKeys("Hassan");
        Thread.sleep(1000);
        WebElement dropdown3=driver.findElement(By.xpath("//*[@id='state']"));
        Select s2=new Select(dropdown3);
        s2.selectByVisibleText("Karnataka");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Mysore");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id='pincode']")).sendKeys("573201");
       Thread.sleep(2000);
     //  driver.findElement(By.xpath("//*[@id='yes']")).click();
      // Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id='pan_number']")).sendKeys("abcde5254u");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id='usermobile']")).sendKeys("8296459429");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id='email']")).sendKeys("ABCDEG@gmail.com");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id=\"cibil_form\"]/ul[4]/li[3]/div/label")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id='submit_sales']")).click();
       Thread.sleep(1000);

        

	}

}
