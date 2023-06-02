package tasks;


import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class CompararResultado {
	 public static Performable resultado(int totalEsperado, String valorCalculadoWeb, int valorCalculadoOperacion) {
	        return Task.where("{0} almacenar las cantidades de libros en memoria ",
	                actor -> {	  
	                	
	                	Serenity.recordReportData().withTitle("Valores")
	            		.andContents("Suma Total--> " + "\n<------------->" + "\nValor Esperado :"
	            				+ totalEsperado + "\nValor Calculado Página:"
	            				+ valorCalculadoWeb + "\nValor Calculado Operación:"
	            				+valorCalculadoOperacion);
	                }
	        );
}
	 }


