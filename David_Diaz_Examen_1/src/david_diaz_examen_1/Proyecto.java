package david_diaz_examen_1;

import java.util.ArrayList;

public class Proyecto {
    private String nombre;
    private ArrayList<Archivo> archivos = new ArrayList();
    private ArrayList<Usuario> usuarios = new ArrayList();
    private int commit;

    public Proyecto() {
    }
    
    public Proyecto(String nombre, int commit) {
        this.nombre = nombre;
        this.commit = commit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<Archivo> archivos) {
        this.archivos = archivos;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public int getCommit() {
        return commit;
    }

    public void setCommit(int commit) {
        this.commit = commit;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
