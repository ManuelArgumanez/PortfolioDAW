# Configuración de Apache en Ubuntu

En esta práctica he configurado una página web propia en una máquina virtual de Ubuntu. He creado los archivos de la web, preparado un VirtualHost y configurado el nombre miweb.test para abrirla desde Firefox. Al terminar, la página se muestra correctamente y Apache sigue funcionando.

El alcance de la parte práctica termina en la primera página web funcionando, según la indicación del profesor. Las comprobaciones documentadas se han realizado dentro de la máquina virtual.

## 1 Comprobación del servidor

Primero comprobé la versión con apache2 -v, que mostró Apache/2.4.58. Después revisé el estado del servicio. El mensaje active (running) indica que Apache está arrancado y atendiendo peticiones.

systemctl status apache2 --no-pager

![Captura](capturas_docx/media/image1.png)

Figura 1. Servicio Apache activo.

Abrí http://localhost en Firefox. La página de bienvenida con “It works!” confirmó que el servidor respondía desde Ubuntu.

![Captura](capturas_docx/media/image2.png)

Figura 2. Página inicial de Apache en localhost.

## 2 Creación de la página y del VirtualHost

Creé una carpeta para mi sitio y un archivo index.html. La página tiene una presentación del proyecto, el centro de estudios y una lista de lo que se va a aprender. Añadí colores y un fondo sencillo para darle un toque personal.

sudo mkdir -p /var/www/miweb  
sudo nano /var/www/miweb/index.html  
ls -l /var/www/miweb/

![Captura](capturas_docx/media/image3.png)

Figura 3. Archivo index.html creado dentro de miweb.

Después creé /etc/apache2/sites-available/miweb.conf. Un VirtualHost le dice a Apache qué página debe mostrar cuando recibe una petición para un nombre concreto.

sudo nano /etc/apache2/sites-available/miweb.conf

![Captura](capturas_docx/media/image4.png)

Figura 4. Configuración del sitio miweb.test.

ServerName establece el nombre miweb.test y DocumentRoot apunta a /var/www/miweb. El puerto 80 se utiliza para HTTP. Require all granted permite acceder a la carpeta y Options -Indexes evita listar sus archivos si no existe una página de inicio. ErrorLog y CustomLog guardan los errores y las peticiones del sitio.

Para guardar los cambios en nano utilicé Ctrl + O y Enter; después salí con Ctrl + X.

## 3 Activación y revisión de la configuración

Activé el sitio con a2ensite y comprobé la configuración antes de recargar Apache. Esta revisión sirve para encontrar errores de escritura que pueden impedir que se apliquen los cambios.

sudo a2ensite miweb.conf  
sudo apache2ctl configtest

![Captura](capturas_docx/media/image5.png)

Figura 5. Activación del sitio y error detectado en el cierre del bloque.

La primera comprobación indicó un error en la línea 14 de miweb.conf, relacionado con el cierre de VirtualHost. Revisé el archivo, dejé el cierre como \</VirtualHost\>, guardé los cambios y repetí la prueba. El mensaje “Site miweb already enabled” solo indicaba que el sitio ya estaba activado.

![Captura](capturas_docx/media/image6.png)

Figura 6. Comprobación final con Syntax OK.

Syntax OK confirmó que la configuración ya era válida. También apareció el aviso AH00558, porque Apache no tenía un ServerName global definido. Ese aviso no impidió que la comprobación terminara correctamente ni que la web funcionara.

sudo systemctl reload apache2

![Captura](capturas_docx/media/image7.png)

Figura 7. Aviso de systemd al recargar el servicio.

Al recargar apareció otro aviso: systemd necesitaba actualizar la información del servicio. Para resolverlo se indicó ejecutar daemon-reload y volver a recargar Apache. La comprobación posterior mostró el servicio activo y la recarga terminada con éxito.

sudo systemctl daemon-reload  
sudo systemctl reload apache2  
systemctl status apache2 --no-pager

## 4 Servicio activo y nombre local

![Captura](capturas_docx/media/image8.png)

Figura 8. Apache activo tras la recarga, con status=0/SUCCESS.

Para abrir la web con un nombre fácil de recordar, añadí una entrada al archivo /etc/hosts. La dirección 127.0.0.1 apunta a la propia máquina virtual. Esta entrada permite resolver miweb.test en ese Ubuntu; no registra un dominio en Internet.

sudo nano /etc/hosts  
\# Línea añadida, conservando las demás:  
127.0.0.1 miweb.test  
  
cat /etc/hosts

Al principio escribí /etc/host, sin la s final. Esa ruta no era la correcta para configurar la resolución del nombre. Lo corregí abriendo /etc/hosts y añadiendo allí la entrada.

![Captura](capturas_docx/media/image9.png)

Figura 9. Archivo hosts correcto con la entrada de miweb.test.

## 5 Comprobación de la página web

Abrí http://miweb.test en Firefox dentro de Ubuntu. La página ya cargaba, pero algunas tildes y signos aparecían mal. El problema estaba relacionado con la codificación del texto.

![Captura](capturas_docx/media/image10.png)

Figura 10. Primera visualización con caracteres incorrectos.

Revisé index.html y la declaración \<meta charset="UTF-8"\>. Después guardé los cambios y recargué Firefox con Ctrl + Mayús + R. En la siguiente comprobación las tildes y los signos se mostraron correctamente.

![Captura](capturas_docx/media/image11.png)

Figura 11. Página final funcionando en miweb.test.

El navegador muestra “No seguro” porque el acceso se hace mediante HTTP, sin cifrado HTTPS. La prueba realizada confirma el funcionamiento del sitio por HTTP.

## 6 Banco de pruebas

Las pruebas se realizaron con la terminal y Firefox de la máquina virtual. Se comparó lo que debía pasar con lo que se veía en las capturas.

| **Prueba**           | **Resultado esperado**      | **Resultado observado**                     |
|----------------------|-----------------------------|---------------------------------------------|
| Estado del servicio  | Apache activo               | active (running). Correcto.                 |
| Abrir localhost      | Página inicial del servidor | Aparece “It works!”. Correcto.              |
| Archivo de la web    | index.html en miweb         | El listado muestra el archivo. Correcto.    |
| Revisión de sintaxis | Syntax OK                   | Error inicial; comprobación final correcta. |
| Recarga del servicio | Recarga sin fallo           | status=0/SUCCESS. Correcto.                 |
| Nombre local         | Entrada en /etc/hosts       | 127.0.0.1 miweb.test. Correcto.             |
| Abrir miweb.test     | Página personalizada        | La página carga en Firefox. Correcto.       |
| Tildes y signos      | Texto legible               | Caracteres correctos en la captura final.   |

## 7 Resultados y conclusiones

Se ha conseguido alojar una página personalizada en Apache y acceder a ella mediante el nombre local miweb.test. El VirtualHost está activado, la configuración supera la comprobación de sintaxis y el servicio permanece activo después de la recarga. También se han corregido los caracteres que se veían mal en el navegador.

No se dispone de resultados comprobados de otros compañeros para hacer una comparación real. Los resultados se han contrastado con el funcionamiento esperado en el tutorial de Ubuntu: crear una web, configurar su VirtualHost y activarlo.

## 8 Valoración personal

La práctica me ha servido para entender cómo se relacionan la carpeta de la web, el VirtualHost y el archivo hosts. Lo que más me ha costado ha sido revisar los pequeños errores de escritura y distinguir un aviso de un error que sí impide continuar. Me quedo con la utilidad de configtest: permite revisar la configuración antes de recargar el servidor.

## 9 Bibliografía

Ubuntu. Install and Configure Apache. Pasos 3, 4 y 5: creación de la web, configuración del VirtualHost y activación del sitio. Consultado durante la práctica.

https://ubuntu.com/tutorials/install-and-configure-apache

Material del profesor. Apache: Configuración. Enunciado con las indicaciones para documentar el proceso, las pruebas, los problemas, los resultados y las conclusiones.

Material del profesor. Apache: Introducción. Base para la organización de la memoria del proyecto.

## 10 Anexo de conceptos y rutas

Este pequeño recordatorio reúne los conceptos y las rutas que ayudan a entender la práctica.

**Apache:** Programa que recibe las peticiones del navegador y devuelve la página web.

**VirtualHost:** Configuración que asocia un sitio con un nombre y una carpeta de archivos.

**localhost y 127.0.0.1:** Se refieren al mismo equipo desde el que se realiza la conexión.

**/var/www/miweb/index.html:** Archivo principal de la página personalizada.

**/etc/apache2/sites-available/miweb.conf:** Archivo de configuración del sitio.

**/etc/hosts:** Archivo que relaciona nombres con direcciones IP en ese equipo.

**/var/log/apache2/miweb_error.log:** Ruta configurada para guardar los errores de este sitio.

**/var/log/apache2/miweb_access.log:** Ruta configurada para registrar las peticiones del sitio.
