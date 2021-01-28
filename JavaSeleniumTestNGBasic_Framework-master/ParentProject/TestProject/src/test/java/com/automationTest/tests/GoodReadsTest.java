package com.automationTest.tests;

import org.testng.annotations.Test;

import com.automationTest.operations.GoodReadsLogin;
import com.automationTest.pages.GoodreadsLandingPage;
import com.framework.dataProvider.DataSet;
import com.framework.dataProvider.GenericDataProvider;
import com.framework.operation.TestOperationFactory;
import com.framework.test.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class GoodReadsTest extends BaseTest {
	
	
	@Test(dataProvider= "TEST", dataProviderClass= GenericDataProvider.class)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: To validate Search Flight functionality.")
	@DataSet("TC001")
	
	
public void loginAccount(String username, String password) throws Exception {
		
		
		GoodReadsLogin login = TestOperationFactory.getOperation(GoodReadsLogin.class);
		login.loginOperations(username, password);
		login.signOut();
	
		
		
		
		
		
			
	}


}



