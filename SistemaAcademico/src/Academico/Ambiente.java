
package Academico;


public class Ambiente {
    
    protected int nroaula;
    protected int aforo;
    protected String tipoaula;
    protected String ubicacion;

    public Ambiente(int nroaula, int aforo, String tipoaula, String ubicacion) {
        this.nroaula = nroaula;
        this.aforo = aforo;
        this.tipoaula = tipoaula;
        this.ubicacion = ubicacion;
    }

    public Ambiente() {
    }

    public int getNroaula() {
        return nroaula;
    }

    public void setNroaula(int nroaula) {
        this.nroaula = nroaula;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public String getTipoaula() {
        return tipoaula;
    }

    public void setTipoaula(String tipoaula) {
        this.tipoaula = tipoaula;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public String Ingresar(){
        
        return "El estudiante debe ingresara clases puntualmente";
    }
    public String Comodidad(){
        
        return "El eambiente debe de dar comodidad a los alumnos";
    }
    public String Resevar(){
        
        return "El ambiente debe estar reservado para los alumnos";
    
    }
    
}
