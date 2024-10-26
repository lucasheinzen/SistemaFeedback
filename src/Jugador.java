public class Jugador extends Usuario {
    public Jugador(String nombreUsuario, String correo, String contraseña) {
        super(nombreUsuario, correo, contraseña);
    }

    public void enviarFeedback(String tipoFeedback, String descripcion) {
        System.out.println("Feedback enviado: " + tipoFeedback + " - " + descripcion);
    }
}
