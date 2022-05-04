#Autor: Brayan Hitta
@HU002
Feature: Validar logeo en la pagina OpenCart

  @Caso3
  Scenario: Validar logeo en la pagina opencart
    Given Se encuentra dentro de la pagina y logeado
    When ingresa los datos de usuario y contrasenna
      | usuario | contrasenna |
      | demo    | demo        |
    And da clic en el boton login
    Then valida que este en la home de la pagina
