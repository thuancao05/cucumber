package page;

import org.openqa.selenium.By;

public class login_page {
    public static By txtUserName = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]");
    public static By txtPassWord = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/input[1]");
    public static By btnLogin = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]");
    public static By lblRemember = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/span[1]/label[1]");

}
