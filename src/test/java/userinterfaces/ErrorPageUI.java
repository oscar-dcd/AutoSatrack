package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ErrorPageUI {
	public static final Target lbl_Mensaje= Target.the("MensajeError").located(By.className("error-code"));
}
