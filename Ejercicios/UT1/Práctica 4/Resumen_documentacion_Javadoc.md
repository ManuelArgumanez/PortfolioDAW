# Documentación del proyecto Java
Resumen generado a partir del HTML de Javadoc. Proyecto: Actividad 5.1 (calculadora e IMC).

Para ver toda la documentación con clases, atributos, métodos y enlaces, abre el index.html de la carpeta HTML.

## Clase Actividad51
Clase principal de la actividad. Desde aqui se abre la ventana para calcular el IMC.

Constructores y métodos documentados:

### `public static void main ( String [] args)`
Inicia el programa y muestra la ventana del IMC.

## Clase MiVentana
Ventana de una calculadora sencilla. Permite sumar, restar, multiplicar y dividir dos numeros.

Constructores y métodos documentados:

### `public MiVentana ()`
Crea la ventana y prepara sus componentes.

### `private void initComponents ()`
Prepara los botones, cuadros de texto y demas elementos de la ventana. Este metodo lo genera NetBeans automaticamente y no se modifica.

### `private void txt_op1ActionPerformed ( ActionEvent evt)`
Evento del primer cuadro de texto. De momento no hace nada.

### `private void rbtn_sumarActionPerformed ( ActionEvent evt)`
Evento de seleccionar la suma.

### `private void txt_op2ActionPerformed ( ActionEvent evt)`
Evento del segundo cuadro de texto. De momento no hace nada.

### `private void btn_calcularActionPerformed ( ActionEvent evt)`
Lee los dos numeros y calcula la operacion que se ha seleccionado. Si escribimos letras en lugar de numeros, muestra un aviso.

### `private void btn_salirActionPerformed ( ActionEvent evt)`
Cierra el programa al pulsar el boton Salir.

### `public static void main ( String [] args)`
Abre directamente la ventana de la calculadora.

## Clase MiVentanaIMC
Ventana para calcular el indice de masa corporal (IMC). El usuario escribe su altura y peso, y el programa muestra el resultado.

Constructores y métodos documentados:

### `public MiVentanaIMC ()`
Crea la ventana del IMC.

### `private void initComponents ()`
Prepara los elementos de la ventana. NetBeans crea esta parte del codigo de forma automatica.

### `private void cb_generoActionPerformed ( ActionEvent evt)`
Evento de la lista de genero. No tiene acciones añadidas.

### `private void txt_tipoActionPerformed ( ActionEvent evt)`
Evento del cuadro donde se muestra el tipo de peso.

### `private void txt_pesoActionPerformed ( ActionEvent evt)`
Evento del cuadro donde se escribe el peso.

### `private void btn_calcularActionPerformed ( ActionEvent evt)`
Calcula el IMC usando la altura y el peso escritos. Despues muestra un texto segun el resultado.

### `private void jButton2ActionPerformed ( ActionEvent evt)`
Cierra el programa al pulsar el boton de salir.

### `public static void main ( String [] args)`
Abre directamente la ventana del IMC.
