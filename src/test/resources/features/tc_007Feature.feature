Feature: Validar la respuesta del sistema ante carga de documento vacío

  Scenario: Usuario intenta cargar un archivo vacío o corrupto
    Given El usuario está en la página de carga de documentos
    When Intenta cargar un archivo sin contenido o corrupto
    Then El sistema identifica la anomalía en el archivo
    And Se muestra un mensaje de error que indica que el contenido del archivo es inválido o está dañado