
package profinal;
import java.util.Scanner;

public class Persona {
    private int identidad;
    private String nombreCompleto;
    private int edad;
    private String fechaNacimiento;
    private String lugarNacimiento;
    private String direccion;
    private String nacionalidad;

    public Persona() {
        
    }

    public Persona(int identidad, String nombreCompleto, int edad, String fechaNacimiento, String lugarNacimiento, String direccion, String nacionalidad) {
        this.identidad = identidad;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.direccion = direccion;
        this.nacionalidad = nacionalidad;
    }
    
    public int getIdentidad() {
        return identidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    public String getInfoPersona(){
        String retorno;
        
        retorno = "\t       Datos Personales\n\n"+
                "Nombre Completo:\t"+nombreCompleto+"\n"+
                "Identidad:\t\t"+identidad+"\n"+
                "Edad:\t\t"+edad+"\n"+
                "Fecha Nacimiento:\t"+fechaNacimiento+"\n"+
                "Lugar Nacimiento:\t"+lugarNacimiento+"\n"+
                "Direccion:\t\t"+direccion+"\n"+
                "Nacionalidad:\t\t"+nacionalidad;
        return retorno;
    }
    
    public String getInfoDatAutor(){
        String retorno;
        
        retorno = "\t       Otros Datos\n\n"+
                "Fecha Nacimiento:\t"+fechaNacimiento+"\n"+
                "Lugar Nacimiento:\t"+lugarNacimiento+"\n"+
                "Nacionalidad:\t\t"+nacionalidad;
        return retorno;
    }

}
