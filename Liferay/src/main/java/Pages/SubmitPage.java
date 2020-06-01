package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Liferay.Form.Generic;

public class SubmitPage extends Generic{

	@FindBy(xpath="//h5[contains(@class,'ddm-form-description')]")
	WebElement SuccessfulMessage;
	
	public SubmitPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	 public String getSuccessfulMessage(){
         return SuccessfulMessage.getText();
   }

	 public  WebElement waitForSubmit() {
		 WebDriverWait wait = new WebDriverWait(driver, 5);
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[1]/div/div/div/div/div/div/div/div/h1")));
	 }																			

}
