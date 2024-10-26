public class Feedback {
    private String tipoFeedback;
    private String descripcion;
    private String jugador;

    // Constructor para inicializar un objeto de feedback
    public Feedback(String tipoFeedback, String descripcion, String jugador) {
        this.tipoFeedback = tipoFeedback;
        this.descripcion = descripcion;
        this.jugador = jugador;
    }

    // Método para mostrar feedback en formato legible
    public String mostrarFeedback() {
        return "Jugador: " + jugador + " | Tipo: " + tipoFeedback + " | Descripción: " + descripcion;
    }
}
