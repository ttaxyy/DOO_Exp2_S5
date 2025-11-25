# DOO_Exp2_S5
El proyecto trae los objetos desde un archivo externo (centros.txt) y los lleva a un ArrayList para luego ser filtrados.
Se incluye un menú que permite desplegar la lista de todos los centros disponibles, así como la opción de filtrar por mínimo de toneladas producidas.

Se incluyen tres paquetes en src:

-ui: Incluye la clase Main. Filtra los objetos y los muestra en consola.

-model: Incluye la clase CentroCultivo. Establece atributos como nombre, comuna y producción en toneladas.

-data: Incluya la clase GestorDatos, que maneja los datos del archivo centros.txt en resources. Convierte el texto en objetos.

Para ejecutar en la terminal:

Navegar a la ruta:

    .../out/production/DOO_Exp2_S5_Javiera_Puga

Luego ejecutar:

    java ui.Main
