public class Mascota {
    private String nombre ;
    private String especie ;
    private int edad;
    //private opcional en la prueba

    public Mascota (String nombre, String especie,int edad){
        this.nombre= nombre;
        this.especie=especie;
        this.edad=edad;
    }
    // Metodo para utilizar los atributos en private
    public String obtenerResumen() {
        return "Nombre: " + this.nombre +
                ", Especie: " + this.especie +
                ", Edad: " + this.edad + " años.";
    }

}
