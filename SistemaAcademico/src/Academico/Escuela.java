
package Academico;


public class Escuela {
    
    
    protected String titulos;
    protected String logros;
    protected String acreditaciones;

    public Escuela() {
    }

    public Escuela(String titulos, String logros, String acreditaciones) {
        this.titulos = titulos;
        this.logros = logros;
        this.acreditaciones = acreditaciones;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getLogros() {
        return logros;
    }

    public void setLogros(String logros) {
        this.logros = logros;
    }

    public String getAcreditaciones() {
        return acreditaciones;
    }

    public void setAcreditaciones(String acreditaciones) {
        this.acreditaciones = acreditaciones;
    }
    
    public String Graduar(){
        
        return "La escuela debe permitir que un alumno se gradue";
    }
    public String Titular(){
        
        return "La escuela puede y debe titular a los alumnos que se lo merezcan";
    }
    public String Organizar(){
        
        return "La escuela puede organizar eventos";
    }
    
    
}
