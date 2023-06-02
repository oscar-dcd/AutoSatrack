package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.ListaOpcionesUI.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ListaOpciones implements Task{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(link_ErrorPages)
				);
		
	}
	public static ListaOpciones lista(){
		return instrumented(ListaOpciones.class);
	}

}
