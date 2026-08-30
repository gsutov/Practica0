# Preguntas de reflexión
### 1. ¿Qué significa programar de forma estructurada? <br>
Organizar el flujo del programa utilizando estructuras de control; además el programa se divide
en pequeñas funciones, lo que facilita su lectura y edición. <br>
### 2. ¿Cuáles son las tres estructuras fundamentales de control? <br>
Seelección, secuencia e iteración. <br>
### 3. ¿Qué ventaja tuvo separar el programa en funciones? <br>
Cada función tiene un objetivo determinado, por lo que si se quiere modificar el código, basta con 
editar esa función específica sin afectar el resto del programa. Además, de ser más fácil de leer y comprender. <br>
### 4. ¿Qué función tendría que modificarse si la calificación mínima aprobatoria cambiara? <br>
Se tendría que modificar estaAprobado, cambiando el valor (actualmente 6) ya que es el encargado de determinar si un alumno aprobó <br>
### 5. ¿Qué diferencia conceptual observa entre una función y un método? <br>
Una función es independiente de una clase y trabaja únicamente con los parámetros que recibe, mientras que un método pertenece a una clase y tiene acceso directo a sus datos o atributos. También se diferencian en que todo método es una función, pero no toda función es un método.<br>
### 6. ¿Qué representa un commit en Git?<br>
Representa una captura del estado de los archivos en un momento específico. Permite generar un historial de cambios, permitiendo regresar a versiones anteriores e identificar qué se modificó en cada punto. <br>
### 7. ¿Por qué es preferible realizar varios commits pequeños en lugar de un solo commit al final?<br>
Permite navegar entre las distintas versiones (o estados) del programa, y revertir una modificación específica si causó un problema
sin alterar el resto del programa. Al ser commits pequeños, es más fácil identificar exactamente en qué modificación originó un error,
incluso se encontrar ese problema gracias al comando git bisect<br>