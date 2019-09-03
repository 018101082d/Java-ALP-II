
package universidad;

public class Alumno {
    
    //Declarar atributos: caracteristicas encapsuladas
    
    protected String codigo;
    protected String apellidos;
    protected String nombres;
    protected int edad;
    
    //Declarar constructores para la Clase Alumno
    //1.- contructur sin sobrecarga de parametros
    
    public Alumno()
    {}
    //2.-constructor con sobrecarga de parametros
    
    public Alumno(String codigo, String apellidos, String nombres, int edad)
    {
    this.codigo = codigo;
    this.apellidos = apellidos;
    this.nombres = nombres;
    this.edad = edad;
    
    }
    
    //Propiedades de la Clase: aceder a los atributos 
    //para la lectura y escritura
    
    //GETTER (Lectura)
    public String getCodigo()
    {
     return this.codigo; 
    }
    
    public String getApellidos()
    {
     return this.apellidos; 
    }
    
    public String getNombres()
    {
     return this.nombres; 
    }
    
    public int getEdad()
    {
     return this.edad; 
    }
    
    
    //SETTER (Escritura)
    
    public void setCodigo(String codigo)
    {
    this.codigo = codigo;
    }
    
     public void setApellidos(String apellidos)
    {
    this.apellidos = apellidos;
    }
     
     public void setNombres(String nombres)
    {
    this.nombres = nombres;
    }
     
     public void setEdad(int edad)
    {
    this.edad = edad;
    }
 
    //implementar metodos u operaciones
     
     public String Estudiar()
     {
       return "El alummno tiene la obligacion de estudiar";
      }
     
     public String Asistir()
     {
      return "El alumno tiene la olbigacion de asistir los sabados";
      }   
     
    public String HacerTarea()
     {
       return "El alumno debe hacer sus tareas ";
     } 
     
    
}
