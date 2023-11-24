package colegio;
/**
 * @author carlo
 */
public class Alumno extends Persona{
    private String Genero;
    private String GradoN;
    private String GradoG;
    public Alumno(String Genero, String identificacion, String nombre, String correo) {
        super(identificacion, nombre, correo);
        this.Genero = Genero;
    }   
    public String getGenero() {
        return Genero;
    }
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    public String getGradoN() {
        return GradoN;
    }
    public void setGradoN(String GradoN) {
        this.GradoN = GradoN;
    }
    public String getGradoG() {
        return GradoG;
    }
    public void setGradoG(String GradoG) {
        this.GradoG = GradoG;
    }
    @Override
    public String toString() {
        return this.getNombre();
    }  
}