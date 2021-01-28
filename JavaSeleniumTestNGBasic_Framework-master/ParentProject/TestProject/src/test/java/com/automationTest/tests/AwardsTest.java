package com.automationTest.tests;

import org.testng.annotations.Test;

import com.automationTest.operations.GoodReadsLogin;
import com.framework.dataProvider.DataSet;
import com.framework.dataProvider.GenericDataProvider;
import com.framework.exceptions.DriverNotInitializedException;
import com.framework.operation.TestOperationFactory;
import com.framework.test.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class AwardsTest extends BaseTest {
	
	@Test(dataProvider= "TEST", dataProviderClass= GenericDataProvider.class)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: To validate Search Flight functionality.")
	@DataSet("TC003")
	
	public void awardsLogin(String username, String password) throws InstantiationException, IllegalAccessException, DriverNotInitializedException {
		
		
		GoodReadsLogin login = TestOperationFactory.getOperation(GoodReadsLogin.class);
		login.loginOperations(username, password);
		login.awardsOperation();
	}
	
}
