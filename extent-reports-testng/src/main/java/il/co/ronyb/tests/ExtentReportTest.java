package il.co.ronyb.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import il.co.ronyb.infra.reports.Reports;
import il.co.ronyb.infra.reports.extent.ExtentReportsBaseTest;

public class ExtentReportTest extends ExtentReportsBaseTest {

	@Test(testName="Test No. 1", description="Test No. 1 :)")
	public void test1() {
		
		for (int i = 0; i < 10; i++) {
			Reports.report("i = " + i);
		}
	}
	
	@Test(testName="Test No. 2")
	public void test2() {
		Reports.report("this is a report for test 2");
		Reports.report("... ...!");
		Assert.fail("This is not so good :(");
	}
}
