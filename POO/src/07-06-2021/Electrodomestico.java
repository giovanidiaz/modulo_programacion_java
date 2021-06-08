public class Electrodomestico {
    String nombre;
    String modelo;
    String marca;

    public Electrodomestico(String nombre, String modelo, String marca) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.marca = marca;
    }

    public Electrodomestico() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    void power(bolean state) {
        if (state) {
            System.out.println("TURN ON");
        } else {
            System.out.println("TURN OFF");
        }

    }

}
