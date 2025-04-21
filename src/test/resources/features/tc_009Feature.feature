Feature: Prueba de integración entre carga de documentos y notificación al usuario

  Scenario: Cargar un documento y recibir notificación de confirmación
    Given El usuario está autenticado en el sistema
    When El usuario carga un documento válido
    Then El documento se carga sin errores
    And El usuario recibe una notificación de éxito