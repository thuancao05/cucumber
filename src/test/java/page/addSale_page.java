package page;

import org.openqa.selenium.By;

public class addSale_page {
    public static By txtCustomser = By.xpath("//input[@id='s2id_autogen12_search']");
    public static By txtProduct = By.xpath("//input[@id='add_item']");
    public static By seCus = By.xpath("//div[@id='s2id_slcustomer']");
    public static By btnSubmit = By.xpath("//input[@id='add_sale']");
    public static By lblAlertSuccess = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[1]");
}
