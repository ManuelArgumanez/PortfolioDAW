# Cuestionario presentación

## 1. ¿Qué significan las siglas HTTP y para qué se utiliza?

HTTP significa hypertext transfer protocol, o protocolo de transferencia de hipertexto, permite que el navegador solicite y reciba páginas de un servidor web

## 2. ¿En qué puerto funciona normalmente el protocolo HTTP?

El puerto que utiliza HTTP por defecto es el 80

## 3. ¿Cuál es la diferencia principal entre HTTP y HTTPS?

HTTPS protege la información mediante cifrado. En HTTP, los datos viajan sin esa protección

## 4. ¿Qué función cumple el servidor web Apache dentro de una arquitectura web?

Se encarga de atender las solicitudes del navegador y enviar el contenido web que se pide

## 5. ¿Cómo puedes comprobar si el servicio de Apache está activo en un sistema Ubuntu?

Puedes consultar su estado ejecutando en la terminal:

```bash
sudo systemctl status apache2
```

## 6. Explica brevemente en qué consiste una arquitectura cliente-servidor.

Es una forma de organizar la comunicación: el cliente realiza una petición y el servidor la atiende y devuelve una respuesta

## 7. ¿Qué diferencia hay entre una arquitectura de dos capas y una de tres capas en entornos web?

En dos capas, el cliente accede directamente al servidor de datos. En tres capas, existe una capa intermedia que procesa las operaciones entre la interfaz y la base de datos

## 8. ¿Qué es el protocolo FTP y para qué se usa?

FTP significa file transfer protocol, o protocolo de transferencia de archivos. Sirve para subir y descargar archivos entre un equipo cliente y un servidor

## 9. Menciona un ejemplo de cliente FTP y un ejemplo de servidor FTP.

FileZilla es un ejemplo de cliente FTP y vsftpd es un ejemplo de servidor FTP.

## 10. ¿Qué diferencia existe entre FTP y SFTP?

FTP no cifra la información por defecto, SFTP realiza la transferencia a través de SSH, protegiendo los datos enviados

## 11. Indica tres tipos de alojamiento web y explica brevemente en qué se diferencian.

- Compartido: varias páginas comparten los recursos de un mismo servidor
- VPS: cada cliente dispone de un servidor virtual con recursos asignados
- Dedicado: todo el servidor se reserva para un único cliente

## 12. ¿Qué ventajas ofrece un servidor VPS frente a un alojamiento compartido?

Permite administrar y configurar el servidor con más libertad, instalar programas propios y disponer de recursos asignados

## 13. Describe brevemente los componentes principales de una arquitectura web moderna.

El navegador muestra la web, el servidor web recibe las solicitudes, el servidor de aplicaciones procesa las operaciones y la base de datos guarda la información

## 14. ¿Qué papel cumple el servidor de aplicaciones dentro de dicha arquitectura?

Se ocupa de ejecutar las funciones de la aplicación y consultar o modificar los datos cuando hace falta

## 15. ¿Qué software o paquete puedes usar para instalar Apache fácilmente en Windows?

Una opción es xampp, que permite instalar apache junto con MariaDB, php y otras herramientas

## 16. ¿Qué carpeta suele contener los archivos del sitio web en una instalación de Apache en Windows (por ejemplo, con XAMPP)?

En xampp, los archivos de la web suelen guardarse en la carpeta htdocs, situada normalmente en `C:\xampp\htdocs`

## 17. Escribe el comando para instalar Apache en Ubuntu desde la terminal.

```bash
sudo apt install apache2
```

## 18. ¿Qué comando se usa para iniciar el servicio Apache en Ubuntu?

```bash
sudo systemctl start apache2
```

## 19. ¿En qué ruta se almacena normalmente la página web por defecto de Apache en Ubuntu?

La página inicial suele ser el archivo index.html, ubicado en `/var/www/html/`.

## 20. ¿Qué es el protocolo SSH y cuál es su propósito principal?

SSH significa Secure Shell y sirve para acceder a otro equipo y administrarlo a distancia mediante una conexión cifrada

## 21. ¿Qué comando se usa para conectarse a un servidor remoto mediante SSH?

Se escribe `ssh usuario@direccion_ip`, sustituyendo el usuario y la dirección IP por los del servidor

## 22. Menciona una ventaja de usar autenticación mediante claves SSH frente a contraseñas.

Dificulta los ataques basados en adivinar contraseñas, porque el acceso requiere disponer de la clave privada correspondiente
