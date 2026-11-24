# GitHub: Introducción

En esta práctica he utilizado GitHub desde el navegador para gestionar un repositorio, guardar cambios, trabajar con ramas y comprobar los permisos. He aprovechado el repositorio que ya tenía creado y he completado los pasos que me faltaban.

Repositorio: https://github.com/ManuelArgumanez/pruebaGitHub

## 1. Crear una cuenta y un repositorio

### Repositorios de mi cuenta

Entré en GitHub con mi cuenta y consulté mis repositorios. Comprobé que ya tenía creado pruebaGitHub y que era público.

![Captura 1: Repositorios de mi cuenta](capturas/01.png)

## 2. Subir archivos al repositorio

### Contenido del repositorio

Abrí pruebaGitHub y comprobé que ya tenía un README.md, un archivo prueba.txt y la rama principal main. El archivo README se creó al iniciar el repositorio. La subida de prueba.txt ya se había realizado desde la web, como se comprueba en el historial del siguiente apartado.

![Captura 2: Contenido del repositorio](capturas/02.png)

## 3. Ver archivos y commits

### Historial de commits

Pulsé en Commits y consulté el historial. Aparecían el commit inicial, la subida del archivo y una modificación realizada por mi compañero.

![Captura 3: Historial de commits](capturas/03.png)

## 4. Crear y administrar ramas

### Ramas del repositorio

Entré en Branches y comprobé que ya tenía dos ramas: main y Create-branch. La segunda estaba un commit por detrás de main.

![Captura 4: Ramas del repositorio](capturas/04.png)

### Comprobación de solicitudes

Entré en Pull requests y comprobé que todavía no había ninguna solicitud abierta ni cerrada.

![Captura 5: Comprobación de solicitudes](capturas/05.png)

### Edición en la rama secundaria

Seleccioné Create-branch y abrí prueba.txt. Pulsé el lápiz y añadí la línea «Modificación realizada desde la rama secundaria.». Guardé el cambio mediante un commit en esa misma rama.

![Captura 6: Edición en la rama secundaria](capturas/06.png)

### Comparación de ramas

Entré en New pull request y seleccioné main como base y Create-branch como compare. GitHub mostraba mi nuevo commit, pero avisaba de que no podía fusionar las ramas automáticamente.

![Captura 7: Comparación de ramas](capturas/07.png)

### Creación del pull request

Creé una solicitud titulada «Fusion de rama secundaria con main». GitHub indicó que debía resolver un conflicto en prueba.txt antes de continuar.

![Captura 8: Creación del pull request](capturas/08.png)

### Resolución del conflicto

Pulsé Resolve conflicts. Las dos ramas habían cambiado el mismo archivo. Elegí Accept current change para mantener mi modificación y quitar la frase poco apropiada de la rama principal. Después pulsé Mark as resolved y Commit merge.

![Captura 9: Resolución del conflicto](capturas/09.png)

### Conflicto resuelto

Comprobé que el indicador de Merge status estaba en verde. El conflicto estaba resuelto y la solicitud estaba lista para fusionarse.

![Captura 10: Conflicto resuelto](capturas/10.png)

### Fusión de las ramas

Pulsé Merge pull request y Confirm merge. La etiqueta morada Merged confirmó que los cambios de Create-branch se habían incorporado a main.

![Captura 11: Fusión de las ramas](capturas/11.png)

## 5. Gestionar configuración y permisos

### Configuración general

Entré en Settings, en el apartado General. Comprobé el nombre del repositorio y que main era la rama predeterminada.

![Captura 12: Configuración general](capturas/12.png)

### Colaboradores y permisos

Entré en Collaborators. Comprobé que el repositorio era público y que jesusandu17 ya estaba añadido como colaborador. No fue necesario cambiar los permisos.

![Captura 13: Colaboradores y permisos](capturas/13.png)

## Conclusión

He aprendido a utilizar GitHub sin necesidad de usar la terminal. He comprobado los archivos y los commits, he fusionado dos ramas mediante un pull request, he resuelto un conflicto y he revisado los colaboradores. Al ser un repositorio público, cualquiera puede consultar su contenido, pero no debo publicar contraseñas ni otros datos privados.
