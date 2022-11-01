@SwagLabs
Feature: Login SwagLabs
  @testSwagLabs
  Scenario: Login correcto en el aplicativo movil SwagLabs

    Given estoy en la App movil SwagLabs
    When ingreso el nombre de usuario "standard_user"
    And ingreso la clave del usuario "secret_sauce"
    And click en el boton login
    Then muestra en la pagina principal el texto "PRODUCTS"
    And muestra en la pagina principal por lo menos un item
