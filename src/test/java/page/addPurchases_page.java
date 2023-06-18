package page;

import org.openqa.selenium.By;

public class addPurchases_page {
    public static By selectSupplier = By.xpath("//span[@id='select2-chosen-8']");
    public static By txtSearch = By.xpath("//input[@id='s2id_autogen8_search']");
    public static By txtProduct = By.xpath("//input[@id='add_item']");
    public static By btnAddPurchase = By.xpath("//input[@id='add_pruchase']");
    public static By lblAlertSuccess = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[1]");

}
