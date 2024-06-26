# TempusFugit

TempusFugit es una aplicación simple escrita en Java que muestra el tamaño ocupado de las carpetas temporales del usuario y del sistema en un sistema Windows. La aplicación recorre las carpetas temporales del usuario y del sistema, así como la carpeta Windows\Prefetch, y muestra el tamaño ocupado de cada una en bytes, kilobytes, megabytes, gigabytes o terabytes, según corresponda. Un botón permite eliminar el contenido de estas carpetas para mayor desempeño del sistema.
Se ha desarrollado una UI mediante JavaFX para que la experiencia de usuario sea más fluida.

## GUI

### Vista principal  
![alt text](https://github.com/HarounDominique/TempusFugit/blob/master/images/TF1.png "First view")


### Vista de confirmación de eliminación  
![alt text](https://github.com/HarounDominique/TempusFugit/blob/master/images/TF2.png "Second view")


### Vista principal actualizada  
![alt text](https://github.com/HarounDominique/TempusFugit/blob/master/images/TF3.png "Updated first view")


## Requisitos

- Java Development Kit (JDK) instalado en el sistema.
- Sistema operativo Windows.

## Instrucciones de Uso

1. Clona o descarga este repositorio en tu máquina local.
2. Abre una terminal o línea de comandos.
3. Navega al directorio donde se encuentra el proyecto.
4. Compila el programa ejecutando el siguiente comando:

`javac Main.java`

5. Ejecuta el programa con el siguiente comando:

`java Main`

6. Observa la salida en la consola, que mostrará el tamaño ocupado de las carpetas temporales.

## Estructura del Proyecto

- `Main.java`: Contiene el código fuente del programa Java.
- `README.md`: Este archivo que proporciona información sobre el proyecto.

## Contribuciones

Las contribuciones son bienvenidas. Si encuentras algún problema o quieres mejorar el proyecto, siéntete libre de abrir un issue o enviar un pull request.

## Licencia

Este proyecto está bajo la [Licencia MIT](LICENSE).
