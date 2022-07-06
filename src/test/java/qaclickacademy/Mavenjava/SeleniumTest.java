package qaclickacademy.Mavenjava;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public static void main() throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "D:\\IMPORTANT DOCS\\TRAININGS\\SELENIUM\\DRIVERS\\edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		Thread.sleep(5000);
		driver.get("http://www.thelalit.com");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
	}
	
	
	@Test
	public void BrowserAutomation()
	{
		System.out.println("BrowserAutomation");
	}
	
	@Test
	public void elemntUI()
	{
		System.out.println("elemntUI");
	}

}
