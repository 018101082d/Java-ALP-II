package Formulario;

public class Operaciones {
    // atributos
    
    protected double nro1;
    protected double nro2;
    
    //Propiedades
    
    public double getNro1(){
        
        return this.nro1;
    }
    
    public double getNro2() {
        
        return this.nro2;
    }
            
    public void setNro1(double nro1)
    {
        this.nro1 = nro1;
            
    }
     public void setNro2(double nro2)
    {
       this.nro2 = nro2;
         
    }        
    
    
     //constructores
     // 1.- constructor sin sobre carga
     
     public Operaciones()
     {}
     
     //2.-Constructor con sobre carga de parametros
     
     public Operaciones(double nr1, double nro2)
     {
         this.nro1 = nro1;
         this.nro2 = nro2;
     }
     
     //implementacion de metodos u operaciones
     
     public double Sumar()
     {
         return this.nro1 + this.nro2;
     }
      public double Restar()
     {
         return this.nro1 - this.nro2;
     }
      public double Multiplicar()
     {
         return this.nro1 * this.nro2;
     }
      
      public String Dividir()
     {
         
        if (this.nro2== 0){
            
            return "error! division no aceptada";
        }           
       
        else {
        
            double divide = this.nro1 / this.nro2;
            return String.valueOf(divide);
       }
            
    }

      public double Potencia()
      {
          
          double Pot = 1;
          for (int i = 1; i <= this.nro2; i++) {
              
              Pot = Pot * this.nro1;  
          }
          return Pot;
      }
      
      private double Fact(double nro){
          
          if (nro ==0) {
              return 1;
            
          }
          else  
              return nro * Fact(nro-1);
              
      }
      public double Factorial()
      {
          return Fact(this.nro1);
          
      }
      
      public double Raiz()
      {
          
         return Math.sqrt(this.nro1);
      }
      
      public double Seno()
      {
          return Math.sin(Math.toRadians(this.nro1));
    
      }  
      public double Coseno()
      {
          return Math.cos(Math.toRadians(this.nro1));
    
      } 
      public double Tangente()
      {
          return Math.tan(Math.toRadians(this.nro1));
    
      }        
      
      
      
}   
      
      
     
     
  
