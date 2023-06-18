package page;

import org.openqa.selenium.By;

public class printBarcodes_page {
    public static By lblAddProduct = By.xpath("//label[contains(text(),'Add Product')]");
    public static By lblStyle = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/label[1]");
    public static By lblPrint = By.xpath("//span[contains(text(),'Print:')]");
    public static By txtAddItem = By.id("add_item");
    public static By cbStyle = By.id("style");
    public static By checkSiteName = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]");
    public static By lblSiteName = By.xpath("//label[contains(text(),'site name')]");
    public static By checkProductName = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[2]");
    public static By lblProductName = By.xpath("//label[contains(text(),'Product Name')]");

    public static By checkPrice = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[3]");
    public static By lblPrice = By.xpath("//label[contains(text(),'Price')]");
    public static By checkCurrencies = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[4]");
    public static By lblCurrencies = By.xpath("//label[contains(text(),'Currencies')]");
    public static By checkUnit = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[5]");
    public static By lblUnit = By.xpath("//label[contains(text(),'Unit')]");
    public static By checkCategory = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[6]");
    public static By lblCategory = By.xpath("//label[contains(text(),'Category')]");
    public static By checkVariants = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[7]");
    public static By lblVariants = By.xpath("//label[contains(text(),'Variants')]");
    public static By checkProductImage = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[8]");
    public static By lblProductImage = By.xpath("//label[contains(text(),'Product Image')]");
    public static By checkPromotionalPrice = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[9]");
    public static By lblPromotionalPrice = By.xpath("//label[contains(text(),'Check promotional price')]");
    public static By btnUpdate = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/input[1]");

    public static By lblBarcodeProductImage = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]");
    public static By lblBarcodeSite = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[2]");
    public static By lblBarcodeName = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[3]");
    public static By lblBarcodePrice= By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[4]");
    public static By lblBarcodeUnit = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[5]");
    public static By lblBarcodeCategory = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[6]");
    public static By lblBarcodeImage = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[7]");




}
