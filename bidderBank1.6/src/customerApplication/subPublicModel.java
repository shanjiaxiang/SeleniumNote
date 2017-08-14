package customerApplication;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class subPublicModel {
	public static void select(WebDriver driver,String xpath, String value) {
		// 下拉列表选择 省、市、区
		Select selProvince = new Select(driver.findElement(
				By.xpath(xpath)));
		selProvince.selectByVisibleText(value);
	}
	public static void sendKeysXpath(WebDriver driver,String xpath,String value){
		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
	public static void clickXpath(WebDriver driver,String xpath){
		driver.findElement(By.xpath(xpath)).click();
	}
	public static void upFile(WebDriver driver,String picXpath,String exePath){
		subPublicModel.clickXpath(driver, picXpath);
		Runtime rn = Runtime.getRuntime();
		publicModel.sleep(1);
		try {
			rn.exec(exePath);
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		publicModel.sleep(4);//延时参数很关键
	}
}
