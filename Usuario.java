package EjerciciosHerencia.Ejercicio1;

public class Usuario extends Persona {
    public String correo;
    public String contrasena;

    public Usuario(String nombre, int edad, String sexo, String correo, String contrasena) {
        super(nombre, edad, sexo);
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public void informacionUsuario() {
        System.out.println("=== Informacion del Usuario ===");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Correo: " + this.correo);
        System.out.println("Contrasena: ********");
    }
}
