package customerApplication;
import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

import com.csvreader.CsvReader;
import com.gargoylesoftware.htmlunit.javascript.host.Map;
public class addApplication {
	public static void readCsvFile(String filePath) {
		try {
			ArrayList<String[]> csvList = new ArrayList<String[]>();
			CsvReader reader = new CsvReader(filePath,',',Charset.forName("SJIS"));
			reader.readHeaders();
			
			while (reader.readRecord()) {
				csvList.add(reader.getValues());
			}
			reader.close();
			for (int row = 0; row < csvList.size(); row++) {
				System.out.println(csvList.get(row)[0]);
				System.out.println(csvList.get(row)[1]);
				System.out.println(csvList.get(row)[2]);
				System.out.println(csvList.get(row)[3]);
				System.out.println("---------------------------");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	
	
	
	public static void main(String[] args) {
//		String filePath = "E:\\testData.csv";
//		readCsvFile(filePath);
		
		
		
		String isChain = "1";
		String isNotChain = "2";
		String xpathPro = "/html/body/div[1]/div/div[2]/section/"
				+ "div/div/div/div[2]/div[3]/div/label[1]/select";
		String xpathCity = "/html/body/div[1]/div/div[2]/section/"
				+ "div/div/div/div[2]/div[3]/div/label[2]/select";
		String xpathDis = "/html/body/div[1]/div/div[2]/section/"
				+ "div/div/div/div[2]/div[3]/div/label[3]/select";
		String valuePro = "北京";
		String valueCity = "北京";
		String valueDis = "东城区";
		String xpathStoreName = "//div[@style='margin-left: 20px;']/div[1]/input";
		String storeName = "testName";
		String xpathAddApp = "//a[@href='#/CustomerApplication/detail']/button";
		String xpathAddr = "/html/body/div[1]/div/div[2]/section/div/div/div/div[2]/div[3]/input";
		String address = "朝阳大道";
		String xpathOperate = "/html/body/div[1]/div/div[2]/section/div/div/div/div[2]/div[4]/div[1]/div[1]/input";//经营类型
		String operateValue = "/html/body/div[2]/div/div[1]/ul/li[2]/span";//
		String xpathOperateSub = "/html/body/div[1]/div/div[2]/section/div/div/div/div[2]/div[4]/div[2]/div[1]/input";//
		String operateValueSub = "/html/body/div[3]/div/div[1]/ul/li[7]/span";//
		String xpathlegalName = "/html/body/div[1]/div/div[2]/section/div/div/div/div[2]/div[5]/input";//法人姓名
		String legalName = "单加响";//
		String xpathlegalNum = "/html/body/div[1]/div/div[2]/section/div/div/div/div[2]/div[6]/input";//
		String legalNum = "370404199206206234";//
		String xpathlegalPhone = "/html/body/div[1]/div/div[2]/section/div/div/div/div[2]/div[7]/div/div/div/div[1]/input";//法人手机号
		String legalPhone = "15163221304";//
		String xpathAccountType = "/html/body/div[1]/div/div[2]/section/div/div/div/div[2]/div[8]/label[2]/span[1]/span";//账户类型
		String accountType = "2";//click
		String xpathAccountName = "/html/body/div[1]/div/div[2]/section/div/div/div/div[2]/div[9]/input";//开户人
		String accountName = "单加响";//
		String xpathAccountBank = "/html/body/div[1]/div/div[2]/section/div/div/div/div[2]/div[10]/div/div[1]/input";//开户行
		String accountBank = "/html/body/div[5]/div/div[1]/ul/li[6]/span";///html/body/div[3]/div/div[1]/ul/li[6]/span    //中国建设银行
		String xpathAccountBankSub = "/html/body/div[1]/div/div[2]/section/div/div/div/div[2]/div[11]/input";//支行
		String accountBankSub = "君山支行";//
		String xpathBankAddrP = "/html/body/div[1]/div/div[2]/section/div/div/div/div[2]/div[12]/div/label[1]/select";//地址
		String BankAddrValueP = "山东";//		
		String xpathBankAddrC = "/html/body/div[1]/div/div[2]/section/div/div/div/div[2]/div[12]/div/label[2]/select";//
		String BankAddrValueC = "枣庄";//
		String xpathCardNum = "/html/body/div[1]/div/div[2]/section/div/div/div/div[2]/div[13]/input";//账户号码
		String cardNum = "6227002175040248404";//
		String xpathPhoneB = "/html/body/div[1]/div/div[2]/section/div/div/div/div[2]/div[14]/input";//开户电话
		String PhoneB = "15163221303";//
		String picA = "/html/body/div[1]/div/div[2]/section/div/div/div/div[2]/div[15]/div/i";//图片
		String picB = "/html/body/div[1]/div/div[2]/section/div/div/div/div[2]/div[16]/div/i";//
		String picC = "/html/body/div[1]/div/div[2]/section/div/div/div/div[2]/div[17]/div/i";//
		String btSava = "/html/body/div[1]/div/div[2]/section/div/div/div/div[2]/div[18]/button";
		String btConfirm = "/html/body/div[6]/div/div[3]/button[2]";
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.18.178:8888/#/login");
		publicModel.login(driver);//打开登录页
		publicModel.sleep(1);
		
		publicModel.customerManage(driver);//客户管理
		publicModel.sleep(1);
		publicModel.customerApplication(driver);//客户申请
		publicModel.sleep(1);
		subPublicModel.clickXpath(driver, xpathAddApp);//点击新建申请
		subPublicModel.sendKeysXpath(driver, xpathStoreName, storeName);//店铺名称
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/"
//				+ "section/div/div/div/div[2]/div[2]/label["+isNotChain+"]/span[1]/span")).click();//非全国连锁
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/"
				+ "section/div/div/div/div[2]/div[2]/label["+isChain+"]/span[1]/span")).click();//选择全国连锁
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/section/div/div/div/div[2]/div[3]/div/label[1]/select")).click();//
		//下拉列表选择 省、市、区
		subPublicModel.select(driver, xpathPro, valuePro);
		subPublicModel.select(driver, xpathCity, valueCity);
		subPublicModel.select(driver, xpathDis, valueDis);
		
		//详细地址
		subPublicModel.sendKeysXpath(driver, xpathAddr, address);
		//经营类型
		subPublicModel.clickXpath(driver, xpathOperate);
		publicModel.sleep(1);
		subPublicModel.clickXpath(driver, operateValue);
		publicModel.sleep(1);
		subPublicModel.clickXpath(driver, xpathOperateSub);
		publicModel.sleep(1);
		subPublicModel.clickXpath(driver, operateValueSub);
		//法人姓名
		subPublicModel.sendKeysXpath(driver, xpathlegalName, legalName);
		//身份证号
		subPublicModel.sendKeysXpath(driver, xpathlegalNum, legalNum);
		
		//手机号码
		subPublicModel.sendKeysXpath(driver, xpathlegalPhone, legalPhone);
		//银行卡账户类型
		subPublicModel.clickXpath(driver, xpathAccountType);
		//开户人
		subPublicModel.sendKeysXpath(driver, xpathAccountName, accountName);
		
		//页面滚动
		System.out.println("now rolling...");
		((JavascriptExecutor)driver).executeScript("document.getElementsByClassName('content-container')[0].scrollTop=500");
		publicModel.sleep(2);

		//开户行
		subPublicModel.clickXpath(driver, xpathAccountBank);
		publicModel.sleep(2);
		subPublicModel.clickXpath(driver, accountBank);
		publicModel.sleep(2);
		//支行
		subPublicModel.sendKeysXpath(driver, xpathAccountBankSub, accountBankSub);
		//所在省市
		subPublicModel.select(driver, xpathBankAddrP, BankAddrValueP);
		subPublicModel.select(driver, xpathBankAddrC, BankAddrValueC);
		//银行卡号
		subPublicModel.sendKeysXpath(driver, xpathCardNum, cardNum);
		
		//预留手机
		subPublicModel.sendKeysXpath(driver, xpathPhoneB, PhoneB);
		
		//相关照片
		String exePath = "E:\\11.autoit.exe\\upfile2.exe";
		subPublicModel.upFile(driver, picA, exePath);
		publicModel.sleep(3);
		subPublicModel.upFile(driver, picB, exePath);
		publicModel.sleep(3);
		subPublicModel.upFile(driver, picC, exePath);
		
		publicModel.sleep(4);
		//保存按钮
		subPublicModel.clickXpath(driver, btSava);
		//确定按钮
		subPublicModel.clickXpath(driver, btConfirm);
//		publicModel.customerManageSub(driver);
//		publicModel.sleep(2);
//		publicModel.subbranchManage(driver);
//		publicModel.sleep(2);
//		publicModel.cashierManage(driver);
//		publicModel.sleep(2);
//		publicModel.logout(driver);
//		
		
		publicModel.sleep(2);
//		publicModel.close(driver);
	}

}





