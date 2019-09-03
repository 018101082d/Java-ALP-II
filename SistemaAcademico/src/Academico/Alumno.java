
package Academico;

public class Alumno {
    
    protected String codigo;
    protected String apellido;
    protected String nombres;
    protected String correoelectronico;
    protected String segurovida;

    public Alumno() {
        
    }

    public Alumno(String codigo, String apellido, String nombres, String correoelectronico, String segurovida) {
        this.codigo = codigo;
        this.apellido = apellido;
        this.nombres = nombres;
        this.correoelectronico = correoelectronico;
        this.segurovida = segurovida;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getSegurovida() {
        return segurovida;
    }

    public void setSegurovida(String segurovida) {
        this.segurovida = segurovida;
    }       
    
    public String Matricular(){
    
    return " El estudiante debe matricularse en el tiempo establecido " ;
    
    }
    public String Asitencia(){
    
    return " El estudiante debe asistir puntual a clases " ;
    
    }
    public String Pagar(){
    
    return " El estudiante debe pagar puntualmente sus mensualidades  " ;
    
    }
    public String Dispensar(){
    
    return " El estudiante puede dispensar en caso sea necesario " ;
    
    }
  
    
}
