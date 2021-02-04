package com.automationTest.tests;

import org.testng.annotations.Test;

import com.automationTest.operations.GoodReadsCommon;
import com.framework.dataProvider.DataSet;
import com.framework.dataProvider.GenericDataProvider;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.operation.TestOperationFactory;
import com.framework.test.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class BooksTest extends BaseTest {
	

	@Test(dataProvider= "TEST", dataProviderClass= GenericDataProvider.class)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: To validate books sorting functionality.")
	@DataSet("TC001")
	
	
	
	
	public void verifyBookSorting(String username, String password) throws InstantiationException, IllegalAccessException, DriverNotInitializedException {
		
		
		GoodReadsCommon goodReadsCommon = TestOperationFactory.getOperation(GoodReadsCommon.class);
		goodReadsCommon.loginOperations(username, password);
		goodReadsCommon.sortBooks();
		
	}

}
