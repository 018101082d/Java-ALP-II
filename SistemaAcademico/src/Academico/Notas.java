
package Academico;

public class Notas {
    
    protected double af;
    protected double inf;
    protected double rs;
    protected double aporte1;
    protected double aporte2;
    protected double aporte3;
    protected double notafi;

    public Notas() {
    }

    public Notas(double af, double inf, double rs, double aporte1, double aporte2, double aporte3, double notafi) {
        this.af = af;
        this.inf = inf;
        this.rs = rs;
        this.aporte1 = aporte1;
        this.aporte2 = aporte2;
        this.aporte3 = aporte3;
        this.notafi = notafi;
    }

    public double getAf() {
        return af;
    }

    public void setAf(double af) {
        this.af = af;
    }

    public double getInf() {
        return inf;
    }

    public void setInf(double inf) {
        this.inf = inf;
    }

    public double getRs() {
        return rs;
    }

    public void setRs(double rs) {
        this.rs = rs;
    }

    public double getAporte1() {
        return aporte1;
    }

    public void setAporte1(double aporte1) {
        this.aporte1 = aporte1;
    }

    public double getAporte2() {
        return aporte2;
    }

    public void setAporte2(double aporte2) {
        this.aporte2 = aporte2;
    }

    public double getAporte3() {
        return aporte3;
    }

    public void setAporte3(double aporte3) {
        this.aporte3 = aporte3;
    }

    public double getNotafi() {
        return notafi;
    }

    public void setNotafi(double notafi) {
        this.notafi = notafi;
    }
    
    
    public String Aprobar(){
        return "Las notas mayores a 13 aprueban a un alumno ";
    }
    public String Desaprobar(){
        return "Las notas menores a 14 desaprueban a un alumno";
    }
    public String Registrar(){
        return "Las notas deben ser registradas en el tiempo previsto ";
    }
    
    public String Mostrar(){
        return "Las notas deben ser mostradas para que el alumno sepa de su rendimiento ";
    }
    
    
    
    
}
