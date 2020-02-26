
package profinal;
import java.util.Scanner;

public class Lector extends Persona{
    private int idLector;
    private int estadoLector;
    private int tipoLector;

    public Lector() {
        
    }

    public Lector(int idLector, int estadoLector, int tipoLector) {
        this.idLector = idLector;
        this.estadoLector = estadoLector;
        this.tipoLector = tipoLector;
    }

    public Lector(int idLector, int estadoLector, int tipoLector, int identificacion, String nombreCompleto, int edad, date fechaNacimiento, String lugarNacimiento, String direccion, String nacionalidad) {
        super(identificacion, nombreCompleto, edad, fechaNacimiento, lugarNacimiento, direccion, nacionalidad);
        this.idLector = idLector;
        this.estadoLector = estadoLector;
        this.tipoLector = tipoLector;
    }

    public int getIdLector() {
        return idLector;
    }

    public int getEstadoLector() {
        return estadoLector;
    }

    public int getTipoLector() {
        return tipoLector;
    }

    public void setIdLector(int idLector) {
        this.idLector = idLector;
    }

    public void setEstadoLector(int estadoLector) {
        this.estadoLector = estadoLector;
    }

    public void setTipoLector(int tipoLector) {
        this.tipoLector = tipoLector;
    }
    
    
}
