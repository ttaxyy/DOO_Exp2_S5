package model;

/*Clase base de cada centro de cultivo
* Incluye atributos ID, nombre, comuna y producción en toneladas,
* y sus respectivos getter y setter.
* */

public class CentroCultivo {
    private int id;
    private String nombre;
    private String comuna;
    private int produccion; //En toneladas.

    public CentroCultivo(int id, String nombre, String comuna, int produccion) {
        this.id = id;
        this.nombre = nombre;
        this.comuna = comuna;
        this.produccion = produccion;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getComuna() { return comuna; }
    public void setComuna(String comuna) { this.comuna = comuna; }

    public int getProduccion() { return produccion; }
    public void setProduccion(int produccion) { this.produccion = produccion; }

    @Override
    public String toString() {
        return String.format("ID: " + id + ", Nombre: " + nombre + ", Ubicación: " + comuna + ", Produjo: " + produccion + " toneladas.");
    }
}
