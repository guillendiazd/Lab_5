package david_diaz_examen_1;

import java.util.ArrayList;

public class Carpeta extends Archivo{
    private ArrayList <Archivo> archivos = new ArrayList();
    public Carpeta() {
        super();
    }

    public Carpeta(String nombre, int tamanio) {
        super(nombre, tamanio);
    }

    public ArrayList<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<Archivo> archivos) {
        this.archivos = archivos;
    }
    
    @Override
    public String toString() {
        return "Carpeta " + super.toString();
    }
    
}
