/*
Crea una clase Persona con las siguientes variables:

La edad

El nombre

El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
 */

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.edad = 35;
        cliente.nombre = "Joan";
        cliente.telefono = 786544321;
        cliente.setCredito(5300);
        trabajador.setSalario(1500);

        System.out.println("Edad: " + (cliente.edad));
        System.out.println("Nombre: " + (cliente.nombre));
        System.out.println("Teléfono: " + (cliente.telefono));
        System.out.println("Crédito: " + cliente.getCredito());
        System.out.println("Salario: " + trabajador.getSalario());
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }
    public int getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona {
    int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getSalario() {
        return this.salario;
    }
}