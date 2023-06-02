package questions;

import static userinterfaces.LoginUI.*;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Login {
	public static Question<String> welcome() {
    	return actor -> actor.asksFor(Text.of(lbl_available_books)); 
    }
}
