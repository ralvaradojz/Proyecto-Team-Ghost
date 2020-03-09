
package profinal;
import java.util.Scanner;

public class Usuario extends Persona{
    private int idUsuario;
    private String nombreUsuario;
    private String contraseña;

    public Usuario() {
        
    }

    public Usuario(int idUsuario, String nombreUsuario, String contraseña) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public Usuario(int idUsuario, String nombreUsuario, String contraseña, int identificacion, String nombreCompleto, int edad, String fechaNacimiento, String lugarNacimiento, String direccion, String nacionalidad) {
        super(identificacion, nombreCompleto, edad, fechaNacimiento, lugarNacimiento, direccion, nacionalidad);
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public String getInfoUsuario(){
        String retorno;
        
        retorno = "\t       Datos Usuario\n\n"+
                "Id Usuario:\t\t"+idUsuario+"\n"+
                "Usuario:\t\t"+nombreUsuario+"\n"+
                "Contraseña:\t\t"+contraseña;
        return retorno;
    }
    
    
}
