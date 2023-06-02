package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class BookUI {
	public static final Target txt_CantidadJavaBook= Target.the("CantidadJavaBook").located(By.xpath("//table[@id='listing']//td[text()='Core Java']//following-sibling::td//input"));
	public static final Target txt_CantidadRubyBook= Target.the("CantidadRubyBook").located(By.xpath("//table[@id='listing']//td[text()='Ruby for Rails']//following-sibling::td//input"));
	public static final Target txt_CantidadPythonBook= Target.the("QuantityPythonBooks").located(By.xpath("//table[@id='listing']//td[text()='Python Cookbook']//following-sibling::td//input"));
	public static final Target btn_Agregar = Target.the("Agregar").located(By.xpath("//input[@value='Add']"));
	public static final Target lbl_CostUnitJava = Target.the("CostUnitJava").located(By.xpath("//table[@id='listing']//td[text()='Core Java']//following-sibling::td[2]"));
	public static final Target lbl_CostUnitRuby = Target.the("CostUnitRuby").located(By.xpath("//table[@id='listing']//td[text()='Ruby for Rails']//following-sibling::td[2]"));
	public static final Target lbl_CostUniPython = Target.the("CostUniPython").located(By.xpath("//table[@id='listing']//td[text()='Python Cookbook']//following-sibling::td[2]"));
	public static final Target txt_ValorPagar = Target.the("ValorPagar").located(By.id("total"));
	public static final Target lbl_MyCart = Target.the("MyCart").located(By.xpath("//div[@id='cart']//h2"));
	
}
