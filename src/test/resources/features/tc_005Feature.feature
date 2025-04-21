Feature: Validar la descarga de un documento

  Scenario: Descargar y verificar la integridad de un documento
    Given el usuario ha seleccionado un documento previamente cargado
    When el usuario hace clic en la opción 'Descargar'
    Then el proceso de descarga se inicia y el archivo se guarda en la ubicación predeterminada del usuario
    And el documento se abre correctamente y sin pérdida de información