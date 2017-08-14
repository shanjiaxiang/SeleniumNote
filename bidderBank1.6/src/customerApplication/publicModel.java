package customerApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class publicModel {
	
	//管理后台登录
	public static void login(WebDriver dr) {
		dr.findElement(By.xpath("/html/body/div[1]/form/div[1]/div/div/input")).clear();
		dr.findElement(By.xpath("/html/body/div[1]/form/div[1]/div/div/input")).sendKeys("huangkai");
		dr.findElement(By.xpath("/html/body/div[1]/form/div[2]/div/div/input")).clear();
		dr.findElement(By.xpath("/html/body/div[1]/form/div[2]/div/div/input")).sendKeys("123456");
		dr.findElement(By.xpath("/html/body/div[1]/form/div[4]/div/button")).click();
	}
	//管理后台退出
	public static void logout(WebDriver dr) {
		dr.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/span/i")).click();
		publicModel.sleep(1);
		dr.findElement(By.xpath("/html/body/ul/li[3]")).click();
		
		dr.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[2]")).click();
	}
	//管理后台窗口关闭
	public static void close(WebDriver dr) {
		dr.close();	
	}
	//线程停止second秒
	public static void sleep(int second) {
		try {
			Thread.sleep(second*500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
	//点击客户管理
	public static void customerManage(WebDriver dr) {
		dr.findElement(By.xpath("/html/body/div[1]/div/div[2]/aside/div/ul/li[1]/div")).click();
	}
	//点击用户申请
	public static void customerApplication(WebDriver dr) {
		dr.findElement(By.xpath("/html/body/div[1]/div/div[2]/aside/div/ul/li[1]/ul/li/ul/a[1]/li")).click();
	}
	//点击客户管理（子）
	public static void customerManageSub(WebDriver dr) {
		dr.findElement(By.xpath("/html/body/div[1]/div/div[2]/aside/div/ul/li[1]/ul/li/ul/a[2]/li")).click();
	}
	//点击门店管理
	public static void subbranchManage(WebDriver dr) {
		dr.findElement(By.xpath("/html/body/div[1]/div/div[2]/aside/div/ul/li[1]/ul/li/ul/a[3]/li")).click();
	}
	//点击收银员管理
	public static void cashierManage(WebDriver dr) {
		dr.findElement(By.xpath("/html/body/div[1]/div/div[2]/aside/div/ul/li[1]/ul/li/ul/a[4]/li")).click();
	}
	
	//点击账单管理
	public static void billManage(WebDriver dr) {
		dr.findElement(By.xpath("/html/body/div[1]/div/div[2]/aside/div/ul/li[2]/div")).click();
		dr.findElement(By.xpath("/html/body/div[1]/div/div[2]/aside/div/ul/li[2]/ul/li/ul/a/li")).click();
	}
	//点击活动管理
	public static void activityManage(WebDriver dr) {
		dr.findElement(By.xpath("/html/body/div[1]/div/div[2]/aside/div/ul/li[3]/div")).click();
	}
	
	//点击代理商
	public static void agent(WebDriver dr) {
		dr.findElement(By.xpath("/html/body/div[1]/div/div[2]/aside/div/ul/li[4]/div")).click();
	}
	
	//点击代理商管理
	public static void agentManage(WebDriver dr) {
		dr.findElement(By.xpath("/html/body/div[1]/div/div[2]/aside/div/ul/li[4]/ul/li/ul/a[1]/li")).click();
	}
	
	//点击业务员管理
	public static void salesmanManage(WebDriver dr) {
		dr.findElement(By.xpath("/html/body/div[1]/div/div[2]/aside/div/ul/li[4]/ul/li/ul/a[2]/li")).click();
	}
	
	//点击财务管理/对账管理
	public static void accountCheck(WebDriver dr) {
		dr.findElement(By.xpath("/html/body/div[1]/div/div[2]/aside/div/ul/li[5]/div")).click();
		dr.findElement(By.xpath("/html/body/div[1]/div/div[2]/aside/div/ul/li[5]/ul/li/ul/a/li")).click();
	}

	
	//点击系统管理
	public static void sysManage(WebDriver dr) {
		dr.findElement(By.xpath("/html/body/div[1]/div/div[2]/aside/div/ul/li[6]/div")).click();
	}
	
}
