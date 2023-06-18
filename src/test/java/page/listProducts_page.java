package page;

import org.openqa.selenium.By;

public class listProducts_page {
    public static By columnImage = By.xpath("//thead/tr[1]/th[2]");
    public static By columnCode = By.xpath("//th[contains(text(),'Code')]");
    public static By columnName = By.xpath("//th[contains(text(),'Name')]");
    public static By columnBrand = By.xpath("//th[contains(text(),'Brand')]");
    public static By columnCategory = By.xpath("//th[contains(text(),'Category')]");
    public static By columnCost = By.xpath("//th[contains(text(),'Code')]");
    public static By columnPrice = By.xpath("//th[contains(text(),'Price')]");
    public static By columnQuantity = By.xpath("//thead/tr[1]/th[9]");
    public static By columnUnit = By.xpath("//th[contains(text(),'Unit')]");
    public static By columnAlertQuantity = By.xpath("//th[contains(text(),'Alert Quantity')]");

    public static By columnAction = By.xpath("//thead/tr[1]/th[12]");
    public static By lemonProduct = By.xpath("//td[contains(text(),'Lemon')]");
    public static By mouseProduct = By.xpath("//td[contains(text(),'Mouse')]");

    public static By btnShow = By.xpath("//body[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]");
    public static By cbShow = By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/select[1]");
}