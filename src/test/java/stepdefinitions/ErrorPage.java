package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowsingTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import questions.IndexOpciones;
import tasks.ListaErrores;
import tasks.ListaOpciones;
import userinterfaces.SahitestErrorPage;

public class ErrorPage {
	private Actor actor = Actor.named("User");
	 @Managed(driver = "chrome")
	    private WebDriver driver;
	 
	 private SahitestErrorPage home;
	
	@Given("el usuario ingresa a la pagina")
    public void el_usuario_ingresa_a_la_pagina() {
    	actor.can(BrowsingTheWeb.with(driver));
    	actor.wasAbleTo(Open.browserOn(home));
    	
    	actor.attemptsTo(
    			Ensure.that(IndexOpciones.index()).isEqualTo("Sahi Tests")
    			
    			);
    }

    @When("el usuario selecciona la opcion Error Pages")
    public void el_usuario_selecciona_la_opcion_error_pages() {
    	actor.wasAbleTo(ListaOpciones.lista());
    }

    @When("selecciona la opcion {string}")
    public void selecciona_la_opcion(String codigoError) {
    	actor.wasAbleTo(ListaErrores.error(codigoError));
    }

    @Then("el usuario entra a la pagina del error {string}")
    public void el_usuario_entra_a_la_opcion_seleccionada(String mensaje) {
    
    	actor.attemptsTo(Ensure.that(driver.getCurrentUrl()).contains(mensaje));
    
    }
}
