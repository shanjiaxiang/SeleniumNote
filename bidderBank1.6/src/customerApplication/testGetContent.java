package customerApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testGetContent {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.18.178:8888/#/login");
		publicModel.login(driver);//打开登录页
		publicModel.sleep(1);
		String content;
		WebElement table = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/section/div/div/div/div[2]/table/tr[1]/td[6]"));
		content = table.getText();
		System.out.println(content);
	}

}
