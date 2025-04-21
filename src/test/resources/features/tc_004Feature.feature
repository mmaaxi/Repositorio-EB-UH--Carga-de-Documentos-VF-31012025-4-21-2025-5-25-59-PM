Feature: Verificar la eliminación de un documento cargado

  Scenario: Eliminar un documento cargado
    Given que el usuario ha cargado un documento válido en el sistema
    When el usuario selecciona la opción 'Eliminar documento' para el archivo cargado
    And el usuario confirma la eliminación
    Then el documento no aparece en la lista y no aparece en futuras consultas