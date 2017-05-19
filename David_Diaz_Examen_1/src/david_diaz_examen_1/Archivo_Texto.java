package david_diaz_examen_1;
public class Archivo_Texto extends Archivo{
    private String contenido;
    
    public Archivo_Texto() {
        super();
    }

    public Archivo_Texto(String contenido, String nombre, int tamanio) {
        super(nombre, tamanio);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    @Override
    public String toString() {
        return super.toString() + ".txt";
    }
    
}
