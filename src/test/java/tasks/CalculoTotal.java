package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import questions.ValorLibro;

public class CalculoTotal {
	 public static Performable librosCompra() {
	        return Task.where("{0} suma total de los libros ",
	                actor -> {	  
	               
	                	String costoJava = actor.asksFor(ValorLibro.java()).replaceAll("\\D+", "");
	            		String costoPython = actor.asksFor(ValorLibro.python()).replaceAll("\\D+", "");
	            		String costoRuby = actor.asksFor(ValorLibro.ruby()).replaceAll("\\D+", "");
	                	
	            	    int cantidadJava = actor.recall("cantidadjava");
	            	    int cantidadPython = actor.recall("cantidadpython");
	            	    int cantidadRuby = actor.recall("cantidadruby");
	            	    
	                	int valorJava = Integer.valueOf(costoJava) * cantidadJava;
	                	int valorPython = Integer.valueOf(costoPython) * cantidadPython;
	                	int valorRuby = Integer.valueOf(costoRuby) * cantidadRuby;
	                	int valorCalculadoOperacion = valorJava + valorPython + valorRuby;
	                	
	                	actor.remember("valorCalculadoOperacion", valorCalculadoOperacion);
	                }
	        );
}
	 }


