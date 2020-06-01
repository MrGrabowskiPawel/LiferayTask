package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Liferay.Form.Generic;


public class DescriptionFields extends Generic{

	public DescriptionFields(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//form[@id='_com_liferay_dynamic_data_mapping_form_web_portlet_DDMFormPortlet_fm']/div[3]/div/div/div/div[1]/div/div/div[1]/div[1]/div/input[1]")
	WebElement nameInput;

	@FindBy(xpath="//textarea[@class='ddm-field-text form-control']")
	WebElement whyInput;
	
	@FindBy(xpath="//input[@class='form-control input-group-inset input-group-inset-after']")
	WebElement dataInput;
	
	@FindBy(xpath="//button[2]")
	WebElement today;
	
	@FindBy(xpath="//button[@class='btn btn-primary lfr-ddm-form-submit pull-right']")
	WebElement submit;
	
	@FindBy(xpath="//div[@class='active ddm-form-page lfr-ddm-form-page']")
	WebElement outside;
	
	@FindBy(xpath="//form[@id='_com_liferay_dynamic_data_mapping_form_web_portlet_DDMFormPortlet_fm']/div[3]/div/div/div/div[1]/div/div/div[1]/div[1]/div/div/div")
	WebElement validationName;
	
	@FindBy(xpath="//div[contains(@class,'col-md-12 col-ddm')]//div[contains(@class,'form-feedback-item help-block')][contains(text(),'This field is required.')]")
	WebElement validationWhy;
	
	@FindBy(xpath="//div[@class='col-md-5 col-ddm']//div[@class='form-feedback-item help-block'][contains(text(),'This field is required.')]")
	WebElement validationData;
			
	@FindBy (xpath="//h4[contains(@class,'lfr-ddm-form-page-description')]")
	WebElement textPartyRock;
		
	@FindBy (xpath="//span[@class='btn-section']")
	WebElement language;
	
	@FindBy (xpath="//span[@class='taglib-text-icon']")
	WebElement portugese;
	
	public void enterName(String name){
		nameInput.sendKeys(name);
	}
	
	public void enterWhy(String text){
		whyInput.sendKeys(text);
	}
	
	public void enterData(String data) {
		dataInput.sendKeys(data);
	
	}
	
	public void clearName() {
		nameInput.clear();
	}
	
	public void clearWhy() {
		whyInput.clear();
	}
	
	public void clearData() {
		dataInput.clear();
	}
	
	public void clickName() {
	nameInput.click();
	}
	public void clickWhy() {
	whyInput.click();
	}
	
	public void clickDate() {
		dataInput.click();
	}
	
	public void setTodayDate() {
		today.click();
	}
	
	public void submit() {
		submit.click();
		}
	
	public void clickOutside() {
		outside.click();
	}
	
	public void clickLanguage() {
		language.click();
	}
	
	public void clickPortugese() {
		portugese.click();
	}
		
	public String getValidationName(){
        return validationName.getText();
	}
	
	public String getValidationWhy(){
        return validationWhy.getText();
	}
	
	public String getValidationData(){
        return validationData.getText();
	}
	
	public String getTextPartyRock() {
		return textPartyRock.getText();
	}
	
	public  WebElement waitForValidation() {
		 WebDriverWait wait = new WebDriverWait(driver, 5);
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-5 col-ddm']//div[@class='form-feedback-item help-block'][contains(text(),'This field is required.')]")));

	}
}