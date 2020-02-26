
package profinal;
import java.util.Calendar;
import java.util.Date;

public class fichaPrestamo {
    private int idPrestamo;
    private date fechaPrestamo;
    private date fechaDevolucion;
    private String observaciones;

    public fichaPrestamo() {
        
    }

    public fichaPrestamo(int idPrestamo, date fechaPrestamo, date fechaDevolucion, String observaciones) {
        this.idPrestamo = idPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.observaciones = observaciones;
    }
    
    public int getIdPrestamo() {
        return idPrestamo;
    }

    public date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public void setFechaPrestamo(date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
