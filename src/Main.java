
    public class Main {
        public static void main(String[] args) {


             Mascota mascota1 = new Mascota("Carlos", "Perro", 3);
            //solo pon los atributos y ya se autogenera
            //los String con comillas

             Mascota mascota2 = new Mascota("Michi","Gato",2);
             //cualquier valor que no sea string va sin comillas

            // 3. Imprime los datos
            System.out.println("Mi mascotas es " +mascota1.obtenerResumen());
            System.out.println("Mi mascotas es " +mascota1.obtenerResumen());
            //Con obtener Resumen conseguimos los valores en privado


            
        }
    }


