
package profinal;
import java.util.Scanner;

public class fichaPrestamo {
    private int idPrestamo;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private String observaciones;

    public fichaPrestamo() {
        
    }

    public fichaPrestamo(int idPrestamo, String fechaPrestamo, String fechaDevolucion, String observaciones) {
        this.idPrestamo = idPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.observaciones = observaciones;
    }
    
    public int getIdPrestamo() {
        return idPrestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
