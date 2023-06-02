package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ListaOpcionesUI {
	public static final Target link_ErrorPages= Target.the("ErrorPages").located(By.xpath("//a[text()='Error Pages']"));
	public static final Target lbl_welcome = Target.the("SahiTests").located(By.xpath("//body//h2"));
}
