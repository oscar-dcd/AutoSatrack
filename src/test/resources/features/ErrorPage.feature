@satrack
Feature: Manejo de errores HTTP
  
  Como usuario de un sitio Web
  Quiero que los errores HTTP se manejen correctamente
  Para comprender y solucionar los problemas de manera adecuada
  
  Rule: Verificar el funcionamiento de los diferentes tipos de errores HTTP

  Scenario Outline: Verificar los errores HTTP
    Given el usuario ingresa a la pagina
    When el usuario selecciona la opcion Error Pages
    And selecciona la opcion <codigoError>
    Then el usuario entra a la pagina del error <mensaje>

    Examples: 
      | codigoError | mensaje |
      | "500 Page"  | "500"   |
      | "404 Page"  | "404"   |
