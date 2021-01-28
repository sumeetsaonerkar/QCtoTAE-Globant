package com.automationTest.tests;

import org.testng.annotations.Test;

import com.automationTest.operations.SearchFlight;
import com.automationTest.pages.GoodreadsLandingPage;
import com.framework.dataProvider.DataSet;
import com.framework.dataProvider.GenericDataProvider;
import com.framework.operation.TestOperationFactory;
import com.framework.test.BaseTest;

import junit.framework.Assert;


public class ClearTripTest extends BaseTest {

	@Test(dataProvider= "TEST", dataProviderClass= GenericDataProvider.class)
	//@Severity(SeverityLevel.CRITICAL)
	//@Description("Test Description: To validate Search Flight functionality.")
	@DataSet("SearchFlight")
	public void verifyFlightSerach(String fromLoc, String ToLoc, String Date) throws Exception {
		
		SearchFlight searchFlight= TestOperationFactory.getOperation(SearchFlight.class);
		searchFlight.SearchFlightOptions(fromLoc, ToLoc,Date);
		Assert.assertTrue(searchFlight.isSearchResultDisplayed());
		//Assert.assertEquals("expectedresults", "actualresults");
		
			
	}

}
