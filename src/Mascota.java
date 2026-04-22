public class Mascota {
    private String nombre ;
    private String especie ;
    private int edad;
    //private opcional en la prueba mejor public

    public Mascota (String nombre, String especie,int edad){
        this.nombre= nombre;
        this.especie=especie;
        this.edad=edad;
        //todo contructor o metodo llama a la variable con this.variable
    }
    public void Animalmenor(){
        if (this.edad<1){
            System.out.println("La mascota de nombre"+this.nombre+"Esta en desarrollo priorizar nutricion");
        }
        else if (this.edad>1){
            System.out.println("La mascota ya es adulta");
        }

        //todo contructor o metodo llama a la variable con this.variable

    }
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}
