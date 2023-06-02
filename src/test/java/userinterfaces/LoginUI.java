package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {
	public static final Target txt_Username = Target.the("Usuario").located(By.name("user"));
	public static final Target txt_Password = Target.the("Password").located(By.name("password"));
	public static final Target btn_Login = Target.the("Login").located(By.xpath("//input[@value='Login']"));
	public static final Target lbl_available_books = Target.the("availableBooks").located(By.xpath("//div[@id='available']//h2"));
}
