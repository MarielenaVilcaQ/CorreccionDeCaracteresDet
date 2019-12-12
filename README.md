# Corrección de caracteres deteriorados


### Requerimientos
- JDK8
- OpenCV

### Instalación
- Descargar OpenCV: https://sourceforge.net/projects/opencvlibrary/files/opencv-win/2.4.13/
  ```
  opencv-2.4.13.6-vc14.exe
  ```
  ejecutarlo como administrador y extraer su contenido.

  ![Image description](https://github.com/MarielenaVilcaQ/CorreccionDeCaracteresOCR/blob/master/opencv.png?raw=true)

- Para añadir la libreria de OpenCV
   clic derecho en Binarización -> properties -> libraries -> Add JAR/Folder, y añadimos el .jar ubicado en la carpeta open cv con la          siguiente ruta opencv\build\java\opencv-2413.jar y Ok.
   ![Image description](https://github.com/MarielenaVilcaQ/CorreccionDeCaracteresOCR/blob/master/opencv2.png?raw=true)

- Para ejecutar el programa por primera vez
  clic derecho en Binarización -> properties -> run, añadir la siguiente linea en VM Options
  ```
  -Djava.library.path="C:\Users\Marielena\Downloads\opencv"\opencv\build\java\x64
  ```
  cambiando lo que se encuentra entre comillas por la ruta en donde se encuentra el OpenCV
  
  ![Image description](https://github.com/MarielenaVilcaQ/CorreccionDeCaracteresOCR/blob/master/ConfiguracionOpenCV.png?raw=true)
