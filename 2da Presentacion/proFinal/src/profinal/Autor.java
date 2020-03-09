
package profinal;
import java.util.Scanner;

public class Autor extends Persona{
    private int idAutor;
    private String nombreAutor;

    public Autor() {
        
    }

    public Autor(int idAutor, String nombreAutor) {
        this.idAutor = idAutor;
        this.nombreAutor = nombreAutor;
    }

    public Autor(int idAutor, String nombreAutor, int identificacion, String nombreCompleto, int edad, String fechaNacimiento, String lugarNacimiento, String direccion, String nacionalidad) {
        super(identificacion, nombreCompleto, edad, fechaNacimiento, lugarNacimiento, direccion, nacionalidad);
        this.idAutor = idAutor;
        this.nombreAutor = nombreAutor;
    }
    
    public int getIdAutor() {
        return idAutor;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }
    
    public String getInfoAutor(){
        String retorno;
        retorno = "\t       Datos de Autor\n\n"+
                "Nombre Completo:\t"+nombreAutor+"\n"+
                "ID de Autor:\t\t"+idAutor;
        return retorno;
    }
}
