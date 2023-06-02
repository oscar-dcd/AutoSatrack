package questions;

import static userinterfaces.ListaOpcionesUI.*;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class IndexOpciones {
	public static Question<String> index() {
    	return actor -> actor.asksFor(Text.of(lbl_welcome)); 
    }
}
