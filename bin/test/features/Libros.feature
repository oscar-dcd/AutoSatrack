@satrack
Feature: Compra de Libros
  
  Como un cliente
  Quiero poder comprar libros
  Para ampliar la coleccion
  
  
  Rule: Verificar que la suma total a pagar sea la correcta

  Scenario Outline: Realizar el proceso de pago
    Given el usuario inicia sesion en la pagina sahitest
    When el usuario agrega a la canasta los libros de Core Java <cantidadJava>, Ruby for Rails <cantidadRuby> y Python Cookbook <cantidadPython>
    Then el usuario verifica el valor total a pagar <totalpago>

    Examples: 
      | cantidadJava | cantidadRuby | cantidadPython | totalpago |
      |            3 |            5 |              2 |      2600 |
