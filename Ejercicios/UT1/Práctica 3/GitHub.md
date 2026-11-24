# GitHub y sus principales funciones

**Autor:** Manuel  
**Centro:** IES Juan Bosco  
**Curso:** 2º DAW  
**Fecha:** 10 de noviembre de 2026

## 1. Introducción

GitHub es una plataforma donde podemos guardar proyectos, compartir código y trabajar con otras personas. Utiliza Git para mantener un historial de los cambios. Esto permite ver qué se ha modificado y consultar versiones anteriores.

Git y GitHub no son lo mismo. Git es la herramienta que controla las versiones de un proyecto. GitHub permite alojar esos repositorios en Internet y añade funciones para colaborar y organizar el trabajo.

En DAW podemos utilizarlo para guardar ejercicios, preparar trabajos en grupo o mostrar nuestros proyectos. En este informe se explica cómo crear un repositorio, gestionar archivos, trabajar con ramas, proponer cambios y organizar tareas. También se incluye cómo publicar una web sencilla.

Los pasos están pensados principalmente para la página web de GitHub. Los nombres de los botones se indican en inglés para que resulte fácil localizarlos. Esta es una guía de uso; los ejemplos no representan acciones ya realizadas en una cuenta.

## 2. Preparación

Para seguir los pasos hay que tener una cuenta de GitHub y entrar en [github.com](https://github.com). Si no tenemos cuenta, podemos crearla desde **Sign up** y completar la verificación que se solicite. Si ya tenemos una, entramos con **Sign in**.

Para practicar usaremos un repositorio propio llamado `practica-github`. La mayoría de los pasos se pueden hacer desde el navegador, sin instalar Git. El apartado de clonación sí utiliza Git en el ordenador.

## 3. Crear un repositorio

Un repositorio es el lugar donde se guardan los archivos del proyecto y su historial. Puede ser público, si queremos que cualquiera lo vea, o privado, si queremos limitar el acceso.

### Pasos

1. Abrir el menú **+** de GitHub y elegir **New repository**.
2. Escribir `practica-github` como nombre.
3. Añadir una descripción, por ejemplo: `Práctica sobre las funciones de GitHub`.
4. Elegir **Public** o **Private** según cómo se quiera compartir.
5. Activar la opción de añadir un archivo **README**.
6. Pulsar **Create repository**.

El resultado será un repositorio con un archivo inicial. El README suele explicar para qué sirve el proyecto y cómo se utiliza. [1]

## 4. Subir archivos al repositorio

Esta función permite añadir archivos que ya tenemos guardados en el ordenador, como este documento `GitHub.md`.

### Pasos

1. Entrar en el repositorio y abrir la pestaña **Code**.
2. Pulsar **Add file** y después **Upload files**.
3. Seleccionar `GitHub.md` o arrastrarlo al área de subida.
4. Escribir un mensaje que explique el cambio, por ejemplo: `Añadir informe sobre GitHub`.
5. En este repositorio de práctica, guardar el cambio en la rama `main` si aparece esa opción y está permitida.
6. Pulsar **Commit changes**.

Un *commit* registra un conjunto de cambios. Su mensaje debe explicar qué se ha hecho. Es mejor escribir `Añadir documentación` que poner solamente `Cambios`. Si una rama está protegida, puede ser necesario utilizar otra rama y una pull request. [2]

## 5. Editar un archivo y consultar cambios

Podemos corregir un documento directamente desde GitHub, sin descargarlo.

### Pasos para editar

1. Abrir el archivo dentro del repositorio.
2. Pulsar el icono del lápiz para editarlo.
3. Modificar el contenido.
4. Si es Markdown, comprobar el formato con **Preview**.
5. Pulsar **Commit changes**, escribir un mensaje y confirmar el cambio.

Para consultar el historial de un archivo, lo abrimos y buscamos **History**. Allí podemos revisar los commits relacionados con él. Al abrir uno se muestran las diferencias: normalmente el rojo señala contenido eliminado y el verde contenido añadido. [3]

## 6. Escribir documentos con Markdown

Markdown permite dar formato a un texto usando símbolos sencillos. Los archivos terminan en `.md`. GitHub los muestra con títulos, listas, enlaces y bloques de código.

Ejemplo:

````markdown
# Título principal
## Apartado

**Texto en negrita**

- Primer elemento
- Segundo elemento

[Enlace a GitHub](https://github.com)

```html
<h1>Hola mundo</h1>
```
````

Para crear un documento desde GitHub, entramos en **Add file → Create new file**, escribimos un nombre como `notas.md`, añadimos el texto y guardamos con **Commit changes**. Antes de guardar podemos revisar su aspecto en **Preview**. [4]

## 7. Crear una rama

Una rama permite preparar cambios por separado. Así podemos trabajar en una mejora antes de incorporarla a la rama principal, que en este ejemplo se llama `main`.

### Pasos

1. Entrar en **Code** y abrir el selector de ramas, donde aparece `main`.
2. Escribir `mejora-readme`.
3. Elegir la opción para crear esa rama desde `main`.
4. Comprobar que estamos en `mejora-readme`.
5. Editar `README.md`, añadir una frase y guardar un commit.

La modificación quedará en la rama nueva hasta que la integremos. [5]

## 8. Crear y fusionar una pull request

Una *pull request* sirve para proponer cambios y revisarlos antes de incorporarlos a otra rama.

### Pasos

1. Abrir **Pull requests → New pull request**.
2. Elegir `main` como destino (**base**) y `mejora-readme` como origen (**compare**).
3. Revisar las diferencias y pulsar **Create pull request**.
4. Escribir un título y explicar el cambio.
5. Revisar **Files changed** y los comentarios.
6. Si tenemos permisos y se cumplen las comprobaciones, pulsar **Merge pull request** y confirmar.

Si hay conflictos, hay que resolverlos antes. Una pull request no se incorpora automáticamente por crearla. [5]

## 9. Crear una incidencia con Issues

Las *issues* permiten apuntar errores, mejoras o tareas pendientes. Por ejemplo, podemos crear una para recordar que falta explicar cómo arrancar el proyecto.

### Pasos

1. Entrar en la pestaña **Issues** del repositorio.
2. Pulsar **New issue**.
3. Elegir una plantilla si aparece o abrir una incidencia en blanco.
4. Escribir un título, como `Añadir instrucciones de instalación`.
5. Explicar lo que falta y guardar la incidencia.
6. Añadir etiquetas o una persona responsable si tenemos permisos.
7. Cuando esté resuelta, dejar un comentario y cerrarla.

Si se trata de un fallo, conviene indicar qué hicimos, qué ocurrió y qué esperábamos que ocurriera. [6]

## 10. Organizar tareas con Projects

Projects permite organizar tareas en una tabla o en un tablero parecido a Trello. Se pueden usar estados como pendiente, en proceso y terminado.

### Pasos

1. Abrir nuestro perfil y entrar en **Projects**.
2. Pulsar **New project**.
3. Elegir una vista de tablero, **Board**, o una plantilla adecuada.
4. Poner un nombre, como `Organización de la práctica`.
5. Añadir tareas o issues del repositorio.
6. Cambiar su estado según avance el trabajo.

Esto ayuda a ver qué queda por hacer. Un proyecto puede reunir incidencias de varios repositorios. [7]

## 11. Descargar o clonar un repositorio

Si solo necesitamos una copia de los archivos, abrimos el repositorio y pulsamos **Code → Download ZIP**. Después descomprimimos el archivo. Esa descarga no incluye el historial de Git.

Si queremos trabajar con el historial y sincronizar cambios, podemos clonar el repositorio.

### Pasos para clonar

1. Tener Git instalado en el ordenador.
2. Abrir el repositorio y pulsar **Code**.
3. Copiar su dirección HTTPS.
4. Abrir la terminal en la carpeta donde queremos guardarlo.
5. Ejecutar este ejemplo, sustituyendo `TU_USUARIO` por el usuario real:

```bash
git clone https://github.com/TU_USUARIO/practica-github.git
cd practica-github
```

Para un repositorio privado hará falta autenticarse con un método admitido. Descargar un ZIP y clonar no son lo mismo: el clon conserva la información de Git. [8]

## 12. Hacer un fork

Un *fork* crea un repositorio propio a partir de otro, manteniendo la relación con el original. Es útil para proponer mejoras cuando no tenemos permiso para modificar directamente el proyecto de otra persona.

### Pasos

1. Abrir un repositorio que permita hacer un fork.
2. Pulsar **Fork**.
3. Elegir nuestra cuenta como destino.
4. Revisar el nombre y pulsar **Create fork**.
5. Realizar cambios en nuestro fork.
6. Si queremos proponerlos al proyecto original, abrir una pull request hacia él.

El propietario decide si acepta la propuesta. Un fork se crea en GitHub; un clon crea una copia local. [9]

## 13. Publicar una página con GitHub Pages

GitHub Pages sirve para publicar sitios estáticos con HTML, CSS y JavaScript. Puede resultar útil para enseñar una práctica de diseño web. No ejecuta directamente un servidor PHP ni una base de datos MySQL.

### Pasos para una página sencilla

1. Utilizar un repositorio público si trabajamos con GitHub Free.
2. Subir un archivo `index.html` y los recursos necesarios a `main`.
3. Abrir **Settings → Pages**.
4. En **Build and deployment**, seleccionar **Deploy from a branch**.
5. Elegir la rama `main` y la carpeta `/(root)`.
6. Pulsar **Save** y esperar a que termine el despliegue.
7. Abrir la dirección que muestre GitHub Pages.

En un sitio de proyecto suele tener este formato:

```text
https://TU_USUARIO.github.io/practica-github/
```

La publicación hace accesible la web a otras personas, por lo que hay que revisar su contenido antes. [10]

## 14. Consejos básicos

- Utilizar nombres de archivos y mensajes de commit claros.
- Mantener el README actualizado.
- Revisar los cambios antes de fusionar una pull request.
- No subir contraseñas, claves privadas ni archivos con datos personales.
- Usar `.gitignore` para excluir archivos locales que no deban versionarse. No elimina del historial lo que ya se haya subido.
- Comprobar si el repositorio es público o privado antes de compartirlo.
- Respetar la licencia de los proyectos ajenos: que un código sea visible no significa que se pueda reutilizar sin condiciones.

## 15. Conclusiones

GitHub sirve para guardar código, pero también para explicar un proyecto y organizar el trabajo. Los repositorios reúnen los archivos, los commits registran cambios y las ramas permiten preparar mejoras por separado.

Las pull requests ayudan a revisar el trabajo antes de unirlo. Issues y Projects sirven para organizar tareas, y Pages permite mostrar una web sencilla. Para los trabajos de DAW, estas funciones pueden ayudar tanto en prácticas individuales como en proyectos de grupo.

## 16. Bibliografía

Documentación oficial de GitHub consultada el 10 de noviembre de 2026:

1. [Crear un repositorio](https://docs.github.com/es/repositories/creating-and-managing-repositories/creating-a-new-repository).
2. [Agregar un archivo](https://docs.github.com/es/repositories/working-with-files/managing-files/adding-a-file-to-a-repository).
3. [Editar archivos](https://docs.github.com/es/repositories/working-with-files/managing-files/editing-files).
4. [Sintaxis básica de Markdown](https://docs.github.com/es/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax).
5. [Hola mundo y flujo de ramas y pull requests](https://docs.github.com/es/get-started/using-github/hello-world).
6. [Crear una incidencia](https://docs.github.com/en/issues/tracking-your-work-with-issues/using-issues/creating-an-issue).
7. [Crear un proyecto](https://docs.github.com/es/issues/planning-and-tracking-with-projects/creating-projects/creating-a-project).
8. [Clonar un repositorio](https://docs.github.com/es/repositories/creating-and-managing-repositories/cloning-a-repository).
9. [Hacer un fork](https://docs.github.com/es/pull-requests/how-tos/work-with-forks/fork-a-repo).
10. [Crear un sitio con GitHub Pages](https://docs.github.com/es/pages/getting-started-with-github-pages/creating-a-github-pages-site).
