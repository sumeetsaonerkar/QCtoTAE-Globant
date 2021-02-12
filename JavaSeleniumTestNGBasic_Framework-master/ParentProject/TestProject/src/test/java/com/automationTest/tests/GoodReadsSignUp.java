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

public class GoodReadsSignUp extends BaseTest {
	

	@Test(dataProvider= "TEST", dataProviderClass= GenericDataProvider.class)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: To validate SignUp functionality.")
	@DataSet("TC002")
	
	
	public void signUpAccount(String registername, String registeremail, String registerpassword) throws DriverNotInitializedException, InstantiationException, IllegalAccessException {
		
		
		GoodReads goodReads = TestOperationFactory.getOperation(GoodReads.class);
		goodReads.signUpOperations(registername, registeremail, registerpassword);
		
	
	}

}
