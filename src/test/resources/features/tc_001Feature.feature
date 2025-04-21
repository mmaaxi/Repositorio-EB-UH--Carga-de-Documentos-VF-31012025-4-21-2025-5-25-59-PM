Feature: Validar carga de documento con formato válido

  Scenario: Cargar y verificar documento PDF válido
    Given el usuario selecciona un documento PDF válido
    When hace clic en "Cargar documento"
    Then el archivo debe comenzar a cargarse
    And el archivo debería aparecer en la lista de documentos con sus metadatos