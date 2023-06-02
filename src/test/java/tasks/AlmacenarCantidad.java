package tasks;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class AlmacenarCantidad {
	 public static Performable libros(int cantidadjava, int cantidadruby, int cantidadpython) {
	        return Task.where("{0} almacenar las cantidades de libros en memoria ",
	                actor -> {	  
	                	actor.remember("cantidadjava", cantidadjava);
	                	actor.remember("cantidadruby", cantidadruby);
	                	actor.remember("cantidadpython", cantidadpython);
	      
	                }
	        );
}
	 }


