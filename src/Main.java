
    public class Main {
        public static void main(String[] args) {
            
             Mascota mascota1 = new Mascota("Carlos", "Perro", 3);
            //solo pon los atributos y ya se autogenera
            //los String con comillas

             Mascota mascota2 = new Mascota("Cloe","Gato",2);
             //cualquier valor que no sea string va sin comillas

            // 2. USO DE GETTERS (Para leer los datos)
            System.out.println("--- INFORMACIÓN INICIAL ---");
            System.out.println("La mascota 1 se llama: " + mascota1.getNombre());
            System.out.println("La edad de la mascota 1 es: " + mascota1.getEdad());
            // Supongamos que Carlos cumplió años y le cambiamos el nombre
            mascota1.setEdad(4);
            mascota1.setNombre("Carlos Junior");

            System.out.println("¡Actualización realizada!");

            // 4. VERIFICAMOS EL CAMBIO leyendo de nuevo con los Getters
            System.out.println("\n--- INFORMACIÓN FINAL ---");
            System.out.println("Nombre actualizado: " + mascota1.getNombre());
            System.out.println("Edad actualizada: " + mascota1.getEdad());

            mascota1.Animalmenor();
            mascota2.Animalmenor();
            //Como es void no retorna nada es más recomendable para la prueba
            //solo llamas al metodo








        }
    }


