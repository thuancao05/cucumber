package page;

import org.openqa.selenium.By;

public class dashboard_page {
    public static By lblLoginSuccess = By.xpath("//p[contains(text(),'You are successfully logged in.')]");
    public static By lblOverviewChart = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[4]/div[1]/h2[1]");
    public static By lblQuickLinks = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/h2[1]");
    public static By lblLatestFive = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/h2[1]");
    public static By lblBestSellers = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/h2[1]");


}
