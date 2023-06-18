package function;

import core.basePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.dashboard_page;

public class dashboard_function  {
    public dashboard_page dashboardPage = new dashboard_page();
    public common_function commonFunction = new common_function();
    public dashboard_function( ) {
    }

    public void verifyDashboardPage() {
        Assert.assertTrue(commonFunction.isDisplayed(dashboardPage.lblLoginSuccess));
        Assert.assertTrue(commonFunction.isDisplayed(dashboardPage.lblOverviewChart));
        Assert.assertTrue(commonFunction.isDisplayed(dashboardPage.lblQuickLinks));
        Assert.assertTrue(commonFunction.isDisplayed(dashboardPage.lblLatestFive));
        Assert.assertTrue(commonFunction.isDisplayed(dashboardPage.lblBestSellers));
        System.out.println("Verify DashBoard Page");

    }
}
