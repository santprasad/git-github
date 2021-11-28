import org.openqa.selenium.chrome.ChromeDriver;

public class Handson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://spicejet.com");

	}

}
