# Práctica: generación de documentación
Investigación breve, aplicación a un proyecto del curso pasado y reflexión personal.

## 1. Comparativa de herramientas
He comparado tres herramientas que sirven para documentar proyectos, aunque cada una está pensada para algo
diferente.

| Herramienta | Facilidad de uso | Integración | Formatos de salida | Comunidad | Curva de aprendizaje |
| --- | --- | --- | --- | --- | --- |
| Javadoc | Fácil si sabes Java y usas `/** */`. | Va bien con Java, JDK y NetBeans. | HTML directamente. PDF si lo conviertes. No Markdown directo. | Muy grande. | Baja - media. |
| JSDoc | Bastante fácil si sabes JavaScript. | Se usa en JavaScript y Node.js. | HTML directamente. PDF y Markdown con otras herramientas. | Grande y conocida. | Baja - media. |
| MkDocs | Fácil para escribir documentación normal. | Sirve para casi cualquier proyecto; usa archivos Markdown. | HTML desde Markdown. PDF con un complemento. | Activa, con temas y plugins. | Baja. |

Mi elección: Javadoc, porque el proyecto que he elegido está hecho en Java y así no tengo que aprender otra
herramienta ni cambiar de lenguaje.
Fuentes consultadas: documentación oficial de Javadoc (Oracle), JSDoc (jsdoc.app) y MkDocs (mkdocs.org).
https://docs.oracle.com/en/java/javase/25/docs/specs/man/javadoc.html
https://jsdoc.app/about-getting-started
https://www.mkdocs.org/

## 2. Aplicación en un proyecto del curso anterior
He escogido la Actividad 5.1 de Java, hecha con NetBeans. El proyecto tiene una ventana de calculadora (sumar,
restar, multiplicar y dividir) y otra ventana que calcula el IMC usando el peso y la altura.
He añadido comentarios tipo Javadoc (/** ... */) a las clases, a los constructores y a los métodos principales. En los
métodos que reciben un evento he usado @param para explicar qué es el parámetro evt. El código creado
automáticamente por NetBeans lo he dejado sin cambiar.

Ejemplo de comentario que he añadido
```java
/**
 * Calcula el IMC usando la altura y el peso escritos.
 * Despues muestra un texto segun el resultado.
 *
 * @param evt evento al pulsar Calcular
 */
```

Para generar la documentación he usado la herramienta javadoc del JDK. El resultado está guardado como página web
(HTML), y además he preparado un resumen en PDF a partir de esa documentación.
Comando que he utilizado:
```bash
javadoc -encoding UTF-8 -docencoding UTF-8 -charset UTF-8 -private -d docs -sourcepath src actividad.pkg5.pkg1
```

## 3. Reflexión personal
Para esta práctica he usado Javadoc porque el proyecto era de Java y me parecía la opción más sencilla. Al principio
tuve que fijarme en cómo se escribían los comentarios, sobre todo en las etiquetas como @param, pero después
resultó bastante fácil. Lo que más tiempo me llevó fue mirar qué hacía cada método para explicarlo con pocas
palabras y sin poner comentarios que no sirvieran de nada.
La mayor ventaja es que no hace falta escribir toda la documentación aparte. Pones los comentarios en el código,
ejecutas Javadoc y te crea unas páginas HTML con las clases y los métodos. También es útil si otra persona tiene que
entender el programa o si pasa tiempo y ya no te acuerdas de para qué servía una parte.
Como desventaja, hay que dedicar tiempo a comentar bien las cosas. Además, la documentación que sale no sirve de
mucho si los comentarios son muy cortos o están mal explicados. En mi proyecto también hay bastante código
generado automáticamente por NetBeans, que no tiene sentido ir cambiando solo para documentarlo.
Sí recomendaría Javadoc para un proyecto en grupo de Java, porque todos pueden seguir la misma forma de comentar
y consultar la documentación sin ir preguntando continuamente. Para un trabajo pequeño quizá no sea tan necesario,
pero para uno más grande sí que viene bien.
