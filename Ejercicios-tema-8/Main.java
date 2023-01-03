//Para practicar la encapsulación:
//
//Crear clase Persona.
//
//Crear variables las privadas edad, nombre y telefono de la clase Persona.
//
//Crear gets y sets de cada propiedad.
//
//Crear un objeto persona en el main.
//
//Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.


public class Main {
    public static void main(String[] args) {
        Persona Alex = new Persona();

        Alex.setEdad(27);
        Alex.setNombre("Alejandro");
        Alex.setTelefono(622711111);

        System.out.println(Alex.getEdad());
        System.out.println(Alex.getNombre());
        System.out.println(Alex.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getTelefono(){
        return this.telefono;
    }
}