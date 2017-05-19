package david_diaz_examen_1;
public class Carpeta extends Archivo{

    public Carpeta() {
        super();
    }

    public Carpeta(String nombre, int tamanio) {
        super(nombre, tamanio);
    }
    
    @Override
    public String toString() {
        return "Carpeta " + super.toString();
    }
    
}
