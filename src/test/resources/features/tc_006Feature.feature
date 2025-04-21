Feature: Verificar visibilidad de un documento cargado

  Scenario: Cargar y verificar visualización de un documento
    Given El usuario está en la página de carga de documentos
    When El usuario carga un documento válido
    Then El documento se carga y se visualiza en el listado de documentos
    When El usuario navega a la sección de documentación
    Then El documento se muestra en el orden y formato esperado según la interfaz