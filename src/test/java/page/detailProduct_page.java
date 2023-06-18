package page;

import org.openqa.selenium.By;

public class detailProduct_page {
    //sau khi click vao san pham se ra trang nay
    public static By imageProduct = By.id("pr-image");
    public static By lblBarcode = By.xpath("//tbody/tr[2]/td[2]/img[1]");
    public static By lblQrcode = By.xpath("//tbody/tr[2]/td[2]/img[2]");
    public static By lblType = By.xpath("//td[contains(text(),'Type')]") ;
    public static By lblName = By.xpath("//td[contains(text(),'Name')]") ;
    public static By lblCode = By.xpath("//td[contains(text(),'Code')]") ;
    public static By lblCategory = By.xpath("//td[contains(text(),'Category')]") ;
    public static By lblUnit = By.xpath("//td[contains(text(),'Unit')]") ;
    public static By lblCost = By.xpath("//td[contains(text(),'Cost')]") ;
    public static By lblPrice = By.xpath("//td[contains(text(),'Price')]") ;
    public static By lblTaxRate = By.xpath("//td[contains(text(),'Tax Rate')]") ;
    public static By lblTaxMethod = By.xpath("//td[contains(text(),'Tax Method')]") ;
    public static By lblAlertQuantity = By.xpath("//td[contains(text(),'Alert Quantity')]") ;
    public static By lblProductDetail = By.xpath("//div[contains(text(),'Product Details')]");
    public static By btnEdit = By.xpath("//body/div[@id='myModal']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/a[1]");


}
