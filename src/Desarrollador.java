public class Desarrollador extends Usuario {
    public Desarrollador(String nombreUsuario, String correo, String contraseña) {
        super(nombreUsuario, correo, contraseña);
    }

    public void revisarFeedback() {
        System.out.println("Revisando feedback recibido.");
    }
}
