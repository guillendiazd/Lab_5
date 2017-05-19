package david_diaz_examen_1;
public class Archivo {
    private String nombre;
    private int tamanio;

    public Archivo() {
    }

    public Archivo(String nombre, int tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
