package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLibClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListnerImplimentationClass.class)
public class CreateCustomer extends BaseClass {
	@Test
	public void createCustomer() throws Throwable {
		Reporter.log("create customer",true);
		
		HomePage h=new HomePage(driver);
		h.setTaskBtn();
		
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getAddCustomerBtn().click();
		
		FileLibClass f=new FileLibClass();
		String customerName = f.getExcelData("CreateCustomer", 1, 3);
		String customerDescription = f.getExcelData("CreateCustomer", 1, 4);
		
		t.getCustomerName().sendKeys(customerName);
		t.getCustomerDescription().sendKeys(customerDescription);
		t.getSelectCustomer().click();
		t.getOurCompany().click();
		t.getCreateCustomer().click();
		Thread.sleep(4000);
		String actualName = t.getActualCustomerCreated().getText();
		Assert.assertEquals(actualName, customerName);
	}
}
