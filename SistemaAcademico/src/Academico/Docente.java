
package Academico;


public class Docente {
    
    protected int dni;
    protected String apellidos;
    protected String nombres;
    protected String gradoacademico;
    protected String especialidad;

    public Docente() {
    }

    public Docente(int dni, String apellidos, String nombres, String gradoacademico, String especialidad) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.gradoacademico = gradoacademico;
        this.especialidad = especialidad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getGradoacademico() {
        return gradoacademico;
    }

    public void setGradoacademico(String gradoacademico) {
        this.gradoacademico = gradoacademico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
    public String Dictar(){
    
    return "El docente debe dictar el tema que le corresponde ";
        }    
    public String Investigar(){
    
    return "El docente investigar del tema que vamos a tratar ";
        }  
    public String Preparar(){
    
    return "El docente debe preparar el tema que avanzara ";
        }  
    public String Asesorar(){
    
    return "El docente puede asesorar a un alumno en su tesis ";
        }  
    
    
}
