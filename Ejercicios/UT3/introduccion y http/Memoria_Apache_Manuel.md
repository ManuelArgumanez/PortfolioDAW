# Instalación y comprobación de Apache en Ubuntu

Manuel  
IES Juan Bosco  
2.º de Desarrollo de Aplicaciones Web  
Despliegue de Aplicaciones Web  
27 de octubre de 2026

## Resumen

En esta práctica he instalado Apache en una máquina con Ubuntu.  
Primero comprobé si el programa estaba instalado.  
Después instalé Apache y sus paquetes necesarios desde la terminal.  
Comprobé el estado del servicio con el comando systemctl.  
Por último, abrí localhost en Firefox para ver la página de bienvenida.  
El resultado fue correcto y guardé capturas de las comprobaciones.

Palabras clave: Apache, Ubuntu, servidor web, HTTP, localhost, instalación.

## Índice

1. [Introducción](#1-introducción)

2. [Actividades realizadas](#2-actividades-realizadas)

3. [Presentación y valoración de resultados](#3-presentación-y-valoración-de-resultados)

4. [Conclusión](#4-conclusión)

5. [Bibliografía](#5-bibliografía)

## 1 Introducción

### Contexto y entorno

Esta práctica corresponde a la asignatura de Despliegue de Aplicaciones Web del ciclo de DAW en el IES Juan Bosco. El trabajo se ha realizado de forma individual en una máquina con Ubuntu, utilizando la terminal para instalar el servidor y Firefox para comprobar su funcionamiento.

### Qué es Apache y para qué sirve

Apache HTTP Server es un servidor web gratuito y de código abierto. Recibe las peticiones de los navegadores y devuelve el contenido solicitado, como páginas HTML e imágenes. En esta práctica, Firefox solicita una página y Apache la entrega desde la misma máquina. \[1\]

### Breve historia

El proyecto Apache comenzó en 1995, cuando un grupo de desarrolladores se organizó para reunir mejoras y correcciones del servidor NCSA HTTPd. El proyecto forma parte de la Apache Software Foundation y se desarrolla de manera colaborativa. \[1\]

### Alternativas

Nginx es otro servidor web. Además de servir páginas, puede actuar como intermediario entre el navegador y otros servidores y repartir las peticiones entre ellos. \[3\]

Caddy es un servidor web que destaca por automatizar la obtención y renovación de certificados para utilizar HTTPS. Es otra alternativa para publicar sitios web. \[4\]

### Motivación y objetivos

El objetivo es aprender a instalar un servidor web y comprobar que funciona. También se busca practicar la redacción de una memoria, explicando lo realizado y mostrando pruebas mediante capturas. Esta primera práctica se centra en la instalación y la comprobación local de Apache.

## 2 Actividades realizadas

### Comprobación inicial

Primero abrí la terminal y ejecuté el siguiente comando para comprobar si Apache estaba disponible:

```bash
apache2 -v
```

El sistema indicó que no se había encontrado el comando. Por eso continué con la instalación.

### Instalación de Apache

```bash
sudo apt install apache2
```

Introduje la contraseña de Ubuntu y confirmé la instalación escribiendo s. La primera vez la contraseña no se aceptó, pero al introducirla de nuevo pude continuar. Ubuntu descargó e instaló Apache junto con los paquetes necesarios. \[2\]

![Captura de la práctica](capturas/media/image1.png)

*Figura 1. Comando de instalación y confirmación de los paquetes.*

![Captura de la práctica](capturas/media/image2.png)

*Figura 2. Desempaquetado y configuración de Apache.*

### Comprobación del servicio

```bash
systemctl status apache2
```

El resultado mostró active (running), por lo que Apache estaba en ejecución. También apareció enabled, que indica que el servicio está habilitado para iniciarse con el sistema. Para salir de esta pantalla utilicé la tecla Q.

![Captura de la práctica](capturas/media/image3.png)

*Figura 3. Apache instalado y servicio en ejecución.*

### Comprobación desde Firefox

Abrí Firefox en la máquina Ubuntu y escribí http://localhost. Apareció la página de bienvenida de Apache con el mensaje It works!, confirmando que el servidor respondía a la petición del navegador.

![Captura de la práctica](capturas/media/image4.png)

*Figura 4. Página de bienvenida de Apache desde localhost.*

## 3 Presentación y valoración de resultados

La instalación se completó y las dos comprobaciones dieron el resultado esperado: el servicio estaba activo y la página de Apache se abrió en Firefox. Las capturas permiten comprobar tanto la instalación como el funcionamiento del servidor.

En el estado del servicio apareció el aviso AH00558 sobre el nombre de dominio del servidor. Aunque se mostró este aviso, Apache arrancó y la página local funcionó. No se realizaron cambios de configuración para eliminarlo.

La prueba se hizo desde la propia máquina mediante localhost. Por tanto, el resultado demuestra el funcionamiento local; no se comprobó el acceso desde otros equipos ni desde Internet.

## 4 Conclusión

He conseguido instalar Apache en Ubuntu y comprobar que funciona desde la terminal y el navegador. La práctica me ha ayudado a entender la función de un servidor web y a distinguir entre tener un programa instalado y tener su servicio en ejecución. También he organizado las capturas para explicar los pasos y justificar el resultado.

## 5 Bibliografía

Fuentes consultadas el 27 de octubre de 2026.

Enunciado del profesor: Apache Introducción. Documento proporcionado para la práctica.

\[1\] Apache HTTP Server Project. Información e historia del proyecto.  
https://httpd.apache.org/ABOUT_APACHE.html

\[2\] Ubuntu Server. How to install Apache2.  
https://ubuntu.com/server/docs/how-to/web-services/install-apache2/

\[3\] Nginx. Página oficial y descripción de sus funciones.  
https://nginx.org/en/

\[4\] Caddy. Página oficial.  
https://caddyserver.com/
