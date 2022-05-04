#Autor: Brayan Hitta

@HU001
Feature: Compra y consulta de vuelos con y sin millas LATAM PASS
  Yo como Usuario de LATAM
  Quiero Comprar y consultar vuelos con y sin millas LATAM PASS
  Para obtener una validación del funcionamiento de la pagina

  Background: Ingreso en la pagina
    Given que brayan se encuentra en la pagina latam airlines

  @Caso1
  Scenario: Comprar vuelos sin ingresar datos
    When no ingresa ningun dato para la compra de un vuelo y selecciona buscar
    Then valida que los campos de informacion queden vacios

  @Caso2
  Scenario: Consulta de vuelos con los datos del viaje sin tener datos reales de la compra
    When ingresa a la casilla mis viajes selecciona adminisitrar mis viajes y selecciona ingresa con los datos de tu viaje
    And ingresa datos de compra que no son reales
      | codigoReserva | apellidoPasj |
      | 022012        | Rodriguez    |
    Then valida que se muestre una alerta por no tener los datos requeridos