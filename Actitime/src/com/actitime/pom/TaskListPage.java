package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement addCustomerBtn;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customerName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescription;
	
	@FindBy(xpath="(//div[.='- Select Customer -'])[1]")
	private WebElement selectCustomer;
	
	@FindBy(xpath="//div[.='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompany;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createCustomer;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']")
	private WebElement actualCustomerCreated;
	
	@FindBy(xpath="//div[.='+ New Project']")
	private WebElement adPrjtBtn;
	
	@FindBy(xpath="//div[.='+ New Tasks']")
	private WebElement adTskBtn;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getAddCustomerBtn() {
		return addCustomerBtn;
	}

	public WebElement getCustomerName() {
		return customerName;
	}

	public WebElement getCustomerDescription() {
		return customerDescription;
	}

	public WebElement getSelectCustomer() {
		return selectCustomer;
	}

	public WebElement getOurCompany() {
		return ourCompany;
	}

	public WebElement getCreateCustomer() {
		return createCustomer;
	}

	public WebElement getActualCustomerCreated() {
		return actualCustomerCreated;
	}

	public WebElement getAdPrjtBtn() {
		return adPrjtBtn;
	}

	public WebElement getAdTskBtn() {
		return adTskBtn;
	}
	
	
	
}
