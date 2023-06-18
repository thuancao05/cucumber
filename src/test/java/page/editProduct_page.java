package page;

import org.openqa.selenium.By;

public class editProduct_page {
    public static By cbProductType = By.id("type");
    public static By lblProductType = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/label[1]");
    public static By lblProductName = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/label[1]");
    public static By lblProductCode = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/label[1]");
    public static By lblSlug = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[1]/div[4]/label[1]");
    public static By lblBarcode = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[1]/div[7]/label[1]");
    public static By cbBarcode = By.id("barcode_symbology");
    public static By EAN8Barcode = By.id("select2-result-label-33");
    public static By cbTaxMethod = By.id("tax_method");
    public static By exclusiveMethod = By.id("select2-result-label-40");
    public static By txtProductName = By.id("name");
    public static By txtProductCode = By.id("code");
    public static By txtSlug = By.id("slug");

    public static By btnEditProduct = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[3]/div[8]/input[1]");

}
