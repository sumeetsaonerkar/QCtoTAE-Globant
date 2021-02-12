package com.automationTest.tests;

import org.testng.annotations.Test;

import com.automationTest.operations.GoodReads;
import com.framework.dataProvider.DataSet;
import com.framework.dataProvider.GenericDataProvider;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.operation.TestOperationFactory;
import com.framework.test.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class WantToReadTest  extends BaseTest  {
	
	@Test(dataProvider= "TEST", dataProviderClass= GenericDataProvider.class)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: To validate want to read functionality.")
	@DataSet("TC005")
	
	public void readBooksCount(String username, String password, String bookName) throws InstantiationException, IllegalAccessException, DriverNotInitializedException {
		
		GoodReads goodReads = TestOperationFactory.getOperation(GoodReads.class);
		goodReads.loginOperations(username, password);
		goodReads.wantToReadCount(bookName);
	}

}
