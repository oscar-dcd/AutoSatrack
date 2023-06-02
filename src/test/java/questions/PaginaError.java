package questions;

import static userinterfaces.ErrorPageUI.*;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PaginaError {
	public static Question<String> mensaje() {
    	return actor -> actor.asksFor(Text.of(lbl_Mensaje)); 
    }
}
