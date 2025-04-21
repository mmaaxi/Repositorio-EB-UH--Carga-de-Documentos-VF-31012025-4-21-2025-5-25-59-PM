Feature: Manejo de múltiples cargas simultáneas

  Scenario: Verificar el manejo de múltiples cargas simultáneas
    Given que el usuario está en la página de carga de documentos
    When el usuario selecciona múltiples archivos de diferentes formatos y tamaños
    Then el sistema acepta múltiples archivos simultáneamente sin bloqueo
    When el usuario inicia la carga de todos los documentos a la vez
    Then cada documento se procesa de manera individual y se muestra el estado de carga
    When el usuario verifica que todos los documentos se carguen correctamente
    Then todos los archivos se muestran listados con sus respectivas validaciones de formato y tamaño