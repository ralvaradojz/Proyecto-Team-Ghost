
package profinal;
import java.util.Scanner;

public class Libro {
    private int idLibro;
    private String tituloLibro;
    private String editorial;
    private int añoPublicacion;
    private String pais;
    private int numeroPaginas;
    private String generoLiterario;

    public Libro() {
    }

    public Libro(int idLibro, String tituloLibro, String editorial, int añoPublicacion, String pais, int numeroPaginas, String generoLiterario) {
        this.idLibro = idLibro;
        this.tituloLibro = tituloLibro;
        this.editorial = editorial;
        this.añoPublicacion = añoPublicacion;
        this.pais = pais;
        this.numeroPaginas = numeroPaginas;
        this.generoLiterario = generoLiterario;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public String getPais() {
        return pais;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }
    
    public String getInfoLibro(){
        String retorno;
        retorno = "\t       Datos del Libro\n\n"+
                "Id de Libro:\t\t"+idLibro+"\n"+
                "Titulo del Libro:\t\t"+tituloLibro+"\n"+
                "Editorial:\t\t"+editorial+"\n"+
                "Año de Publicación:\t"+añoPublicacion+"\n"+
                "Pais:\t\t"+pais+"\n"+
                "N° de Paginas:\t\t"+numeroPaginas+"\n"+
                "Genero Literario:\t"+generoLiterario;
        return retorno;
    }
}
