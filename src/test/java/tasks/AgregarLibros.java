package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.BookUI.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

	public class AgregarLibros implements Task{
		private int cantidadJava;
		private int cantidadRuby;
		private int cantidadPython;
		
		public AgregarLibros(int cantidadJava,int cantidadRuby,int cantidadPython) {
			this.cantidadJava = cantidadJava;
			this.cantidadRuby = cantidadRuby;
			this.cantidadPython = cantidadPython;
		}
		@Override
		public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(
					Enter.theValue(String.valueOf(cantidadJava)).into(txt_CantidadJavaBook),
					Enter.theValue(String.valueOf(cantidadPython)).into(txt_CantidadPythonBook),
					Enter.theValue(String.valueOf(cantidadRuby)).into(txt_CantidadRubyBook),
					Click.on(btn_Agregar)
					);
			
		}
		public static AgregarLibros Addbooks(int cantidadJava,int cantidadRuby,int cantidadPython){
			return instrumented(AgregarLibros.class,cantidadJava,cantidadRuby,cantidadPython);
		}
	}

