package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.BookUI.*;

public class ValorLibro {
	public static Question<String> java() {
    	return actor -> actor.asksFor(Text.of(lbl_CostUnitJava)); 
    }
	public static Question<String> ruby() {
    	return actor -> actor.asksFor(Text.of(lbl_CostUnitRuby)); 
    }
	public static Question<String> python() {
    	return actor -> actor.asksFor(Text.of(lbl_CostUniPython)); 
    }
	
	public static Question<String> total() {
    	return actor -> actor.asksFor(Attribute.of(txt_ValorPagar).named("value"));
    }
	public static Question<String> myCart() {
		return actor -> actor.asksFor(Text.of(lbl_MyCart)); 
    }
}
