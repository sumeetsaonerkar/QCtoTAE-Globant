package com.automationTest.tests;

import org.testng.annotations.Test;

import com.automationTest.operations.GoodReads;
import com.framework.dataProvider.DataSet;
import com.framework.dataProvider.GenericDataProvider;
import com.framework.operation.TestOperationFactory;
import com.framework.test.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


public class ReadingChallengeTest extends BaseTest {
	
	@Test(dataProvider= "TEST", dataProviderClass= GenericDataProvider.class)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: To validate reading challenge functionality.")
	@DataSet("TC007")
	
	
public void readingChallengeTC(String username, String password, String bookname) throws Exception {
		
		
		GoodReads goodReads = TestOperationFactory.getOperation(GoodReads.class);
		goodReads.loginOperations(username, password);
		goodReads.challenge(bookname);
		
	

}
}
