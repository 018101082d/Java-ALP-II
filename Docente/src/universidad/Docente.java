package universidad;


public class Docente {
    
    //atributos encapsulados 
    
    protected int nrodni;
    protected int horaslaborales;
    protected String titulo;
    protected String facultad;
    protected String asignatura;
    
    //declarar constructures
    // 1.- constructor sin sobrecarga de parametros 
    
    public Docente (){
    }
            
    //2. constructor con sobre carga de parametros
    
    public Docente (int nrodni, int horaslaborales, String titulo, String facultad, String asignatura)
      {
         this.asignatura = asignatura;
         this.facultad = facultad;
         this.horaslaborales = horaslaborales;
         this.nrodni = nrodni;
         this.titulo = titulo;
          
      }   
    
    //propiedades de la clase
    //parala lectura y escritura
    //getter (lectura)
    
    
    public int getNroDni()
            {
             return this.nrodni;
              
            }
     public int getHorasLaborales()
            {
             return this.horaslaborales;
              
            }       
    public String getTitulo()
            {
             return this.titulo;
              
            }
    public String getFacultad()
            {
             return this.facultad;
              
            }
     public String getAsignatura()
            {
             return this.asignatura;
              
            }
     //setter (escritura)
     
     public void setNroDni(int nrodni)
     {
         this.nrodni = nrodni;
      
     }
     public void setHorasLaborales(int horaslaborales)
     {
         this.horaslaborales = horaslaborales;
      
     }
     public void setFacultad(String facultad)
     {
         this.facultad = facultad;
      
     }
     public void setTitulo(String titulo)
     {
         this.titulo = titulo;
      
     }
     public void setAsignatura(String asignatura)
     {
         this.asignatura = asignatura;
      
     }
     
     //implementar metodos
     
     
     public String Asistir()
         {
             return "El docente tiene la obligacion de asistir a clases temprano";
         }  
     public String Enseñar()
         {
             return "El docente debe eneseñar con paciencia y dedicacion";
         }  
     public String Evaluar ()
         {
             return "El docente debe evaluar de manera imparcial";
         }  
     public String Asesorar()
         {
             return "El docente puede asesorar aquellos alumnos que le soliciten su apoyo";
         }  
}
