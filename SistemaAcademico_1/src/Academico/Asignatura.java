
package Academico;

public class Asignatura {
    
    protected String codigo;
    protected int duracion;
    protected String horario;
    protected String requisitos;
    protected String planestudio;

    public Asignatura() {
    }

    public Asignatura(String codigo, int duracion, String horario, String requisitos, String planestudio) {
        this.codigo = codigo;
        this.duracion = duracion;
        this.horario = horario;
        this.requisitos = requisitos;
        this.planestudio = planestudio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getPlanestudio() {
        return planestudio;
    }

    public void setPlanestudio(String planestudio) {
        this.planestudio = planestudio;
    }
    
     public String Guiar(){
    
    return " La asignatura debe guiar a los estudiantes  " ;
    
    }
    public String Asignar(){
    
    return " La asignatura asigna tareas  " ;
    
    }
    public String Instruir(){
    
    return " La asignatura intruye a los alumnos   " ;
    
    }
    public String Agrupar(){
    
    return " La asignatura agrupo a los alumnos para realizar activdades  " ;
    
    }
    
    
    
    
    
     
}
