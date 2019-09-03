
package calculadora;

/**
 *
 * Hermoza Pfuyo y Neyra Ccoralla
 */
public class Operaciones {
    protected double nro1;
     protected double nro2;
//constructores
    public Operaciones(double nro1, double nro2) {
        this.nro1 = nro1;
        this.nro2 = nro2;
    }
    
//getters  ands setters
    public double getNro1() {
        return nro1;
    }
    public void setNro1(double nro1) {
        this.nro1 = nro1;
    }
    public double getNro2() {
        return nro2;
    }
    public void setNro2(double nro2) {
        this.nro2 = nro2;
    }
   
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
    public double Dividir() 
    {   
        return this.nro1 / this.nro2;
    }
    public double Raiz() 
    {   
        return Math.sqrt(this.nro1);
    }
    public double Porcentaje() 
    {   
        return ((this.nro1 * this.nro2)/100);
    }
    public double Inverso() 
    {
        return Math.pow(this.nro1, -1);
    }
}
