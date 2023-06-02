package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowsingTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import questions.Login;
import questions.ValorLibro;
import tasks.AgregarLibros;
import tasks.AlmacenarCantidad;
import tasks.CalculoTotal;
import tasks.CompararResultado;
import tasks.LoginCompras;
import userinterfaces.SahitestTraining;
import utils.LeerCSV;

public class Libros {
	private Actor actor = Actor.named("User");
	@Managed(driver = "chrome")
	private WebDriver driver;

	private SahitestTraining home;
	@Before public void cargarUsuario() {
		LeerCSV.usuario();
	}


	@Given("^el usuario inicia sesion en la pagina sahitest$")
	public void el_usuario_inicia_sesion_a_la_pagina_sahitest(){
		actor.can(BrowsingTheWeb.with(driver));
		actor.wasAbleTo(Open.browserOn(home),LoginCompras.logIn());
		actor.attemptsTo(
				Ensure.that(Login.welcome()).isEqualTo("All available books")
				);
	}

	@When("^el usuario agrega a la canasta los libros de Core Java (.+), Ruby for Rails (.+) y Python Cookbook (.+)$")
	public void el_usuario_agrega_a_la_canasta_los_libros_de_core_java_ruby_for_rails_y_python_cookbook(int cantidadjava, int cantidadruby, int cantidadpython) throws Throwable {
		actor.wasAbleTo(AgregarLibros.Addbooks(cantidadjava,cantidadruby,cantidadpython));
        actor.attemptsTo(AlmacenarCantidad.libros(cantidadjava, cantidadruby, cantidadpython));
		actor.attemptsTo(
				Ensure.that(ValorLibro.myCart()).isEqualTo("My Cart")
				);
	}

	@Then("^el usuario verifica el valor total a pagar (.+)$")
	public void el_usuario_verifica_el_valor_total_a_pagar(int totalEsperado){
	
		String valorCalculadoWeb = actor.asksFor(ValorLibro.total());
		actor.attemptsTo(CalculoTotal.librosCompra());
		int valorCalculadoOperacion = actor.recall("valorCalculadoOperacion");
		actor.attemptsTo(
				Ensure.that(valorCalculadoOperacion).isEqualTo(totalEsperado),Ensure.that(Integer.valueOf(valorCalculadoWeb)).isEqualTo(valorCalculadoOperacion)              
				);
		actor.attemptsTo(CompararResultado.resultado(totalEsperado, valorCalculadoWeb, valorCalculadoOperacion));
	}


}
