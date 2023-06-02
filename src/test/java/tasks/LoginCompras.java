package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utils.LeerCSV;

import static userinterfaces.LoginUI.*;

public class LoginCompras implements Task{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(LeerCSV.usuario).into(txt_Username),
				Enter.theValue(LeerCSV.clave).into(txt_Password),
				Click.on(btn_Login)
				);
		
	}
	public static LoginCompras logIn(){
		return instrumented(LoginCompras.class);
	}
}
