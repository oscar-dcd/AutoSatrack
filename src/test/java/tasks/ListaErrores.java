package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.ListaErroresUI.link_Error;
public class ListaErrores implements Task{
	private String codigo;
	
	public ListaErrores(String codigo) {
		this.codigo = codigo;

	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(link_Error.of(codigo)));
		
	
	}
	public static ListaErrores error(String codigo){
		return instrumented(ListaErrores.class,codigo);
	}

}
