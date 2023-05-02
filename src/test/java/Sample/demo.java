package Sample;

public class demo {
    public void sampleTest(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com");

       // Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

       // Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");

        driver.close();
    }
}
