package hooks;

import driver.DriverFactory;
import driver.DriverManager;
import function.*;
import utils.LogUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;

public class TestContext {

    private WebDriver driver;
    private common_function commonFunction;
    private login_function loginFunction;
    private dashboard_function dashboardFunction;
    private product_function productFunction;
    private listProducts_function listProductFunction;
    private detailProduct_function detailProductFunction;
    private printBarcodes_function printBarcodesFunction;
    private addSale_function addSaleFunction;
    private sale_function saleFunction;
    private purchases_function purchasesFunction;
    private listPurchases_function listPurchasesFunction;
    private addPurchases_function addPurchasesFunction;

    public TestContext() {
        ThreadGuard.protect(new DriverFactory().createDriver());
        LogUtils.info("Driver in TestContext: " + getDriver());
    }

    public common_function getCommonFunction() {
        if (commonFunction == null) {
            commonFunction = new common_function();
        }
        return commonFunction;
    }

    public login_function getLoginFunction() {
        if (loginFunction == null) {
            loginFunction = new login_function();
        }
        return loginFunction;
    }
    public dashboard_function getDashboardFunction() {
        if (dashboardFunction == null) {
            dashboardFunction = new dashboard_function();
        }
        return dashboardFunction;
    }
    public product_function getProductFunction() {
        if (productFunction == null) {
            productFunction = new product_function();
        }
        return productFunction;
    }
    public detailProduct_function getDetailProductFunction() {
        if (detailProductFunction == null) {
            detailProductFunction = new detailProduct_function();
        }
        return detailProductFunction;
    }
    public listProducts_function getListProductFunction() {
        if (listProductFunction == null) {
            listProductFunction = new listProducts_function();
        }
        return listProductFunction;
    }
    public printBarcodes_function getPrintBarcodesFunction() {
        if (printBarcodesFunction == null) {
            printBarcodesFunction = new printBarcodes_function();
        }
        return printBarcodesFunction;
    }
    public addSale_function getAddSaleFunction() {
        if (addSaleFunction == null) {
            addSaleFunction = new addSale_function();
        }
        return addSaleFunction;
    }
    public sale_function getSaleFunction() {
        if (saleFunction == null) {
            saleFunction = new sale_function();
        }
        return saleFunction;
    }
    public purchases_function getPurchasesFunction() {
        if (purchasesFunction == null) {
            purchasesFunction = new purchases_function();
        }
        return purchasesFunction;
    }
    public listPurchases_function getListPurchasesFunction() {
        if (listPurchasesFunction == null) {
            listPurchasesFunction = new listPurchases_function();
        }
        return listPurchasesFunction;
    }
    public addPurchases_function getAddPurchasesFunction() {
        if (addPurchasesFunction == null) {
            addPurchasesFunction = new addPurchases_function();
        }
        return addPurchasesFunction;
    }


    public WebDriver getDriver() {
        return DriverManager.getDriver();
    }
}
