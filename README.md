# Sistema de Feedback para Beta Testing de Videojuegos

## Descripción
Este sistema fue desarrollado para que jugadores puedan dar su feedback durante las pruebas beta de un videojuego. Ayuda a los desarrolladores a ver los problemas, mejoras o sugerencias de los jugadores antes de lanzar el producto final. Funciona a través de una interfaz de consola.

## Funcionalidades
- **Registro de Jugadores**: Permite registrar jugadores que luego podrán enviar feedback.
- **Envío de Feedback**: Los jugadores registrados pueden enviar feedback clasificado en diferentes categorías.
- **Revisión de Feedback**: Los desarrolladores pueden ver todos los feedbacks enviados para analizarlos.

## Tecnologías Utilizadas
- **Java**: Lenguaje principal para la implementación de la lógica del sistema.
- **MySQL**: Pensado para persistencia en futuras versiones.
- **JDBC**: Conector para interacciones con la base de datos (no implementado en esta versión).

## Estructura del Proyecto
- **SistemaFeedback**: Clase principal que gestiona el menú del sistema y la interacción con el usuario.
- **Usuario**: Clase general que representa a un usuario del sistema.
- **Jugador**: Clase que hereda de Usuario y representa a los jugadores que envían feedback.
- **Desarrollador**: Clase que hereda de Usuario y representa a los desarrolladores que revisan feedback.
- **Feedback**: Clase que representa cada comentario o sugerencia enviado.

## Instrucciones de Uso
1. Ejecutar `SistemaFeedback.java` para iniciar el sistema en consola.
2. Seguir el menú para:
    - **Registrar Jugador**
    - **Enviar Feedback (Jugador)**
    - **Revisar Feedback (Desarrollador)**
3. Ingresar los datos requeridos para cada opción en pantalla.

## Futuras Extensiones
- **Conexión a Base de Datos MySQL**: Permitirá almacenar feedbacks y usuarios de forma persistente.
- **Interfaz Gráfica**: Mejorará la interacción con el usuario, eliminando la necesidad de consola.

## Autor
- **Lucas Heinzen**
- **Estudiante de Informática en la Universidad Siglo 21**
