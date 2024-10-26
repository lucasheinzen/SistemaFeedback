import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que maneja el sistema de feedback. Permite registrar jugadores,
 * enviar feedback y ver el feedback (revisión).
 */
public class SistemaFeedback {
    private static ArrayList<Usuario> usuarios = new ArrayList<>(); // Lista para guardar los usuarios
    private static ArrayList<Feedback> feedbacks = new ArrayList<>(); // Lista para guardar feedbacks

    /**
     * Método principal del sistema, ejecuta el menú con las opciones.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;  // Inicializamos con 0 para que no tire error

        do {
            System.out.println("\nBienvenido al Sistema de Feedback");
            System.out.println("1. Registrar Jugador");
            System.out.println("2. Enviar Feedback (Jugador)");
            System.out.println("3. Revisar Feedback (Desarrollador)");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer para evitar errores en el scanner

                switch (opcion) {
                    case 1:
                        registrarJugador(scanner);
                        break;
                    case 2:
                        enviarFeedback(scanner);
                        break;
                    case 3:
                        revisarFeedback();
                        break;
                    case 4:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente otra vez.");
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada no válida. Por favor, ingrese un número.");
                scanner.nextLine(); // Limpiamos el buffer después de un error
            }
        } while (opcion != 4);

        scanner.close();
    }

    /**
     * Método que registra un nuevo jugador, evitando usuarios con el mismo nombre.
     * @param scanner Escáner para capturar los datos de entrada del usuario.
     */
    private static void registrarJugador(Scanner scanner) {
        System.out.print("Ingrese nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        // Verificamos si el nombre de usuario ya existe
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                System.out.println("Error: Nombre de usuario ya registrado. Intente con otro.");
                return; // Sale del método si encuentra un duplicado
            }
        }

        System.out.print("Ingrese correo electrónico: ");
        String correo = scanner.nextLine();
        System.out.print("Ingrese contraseña: ");
        String contraseña = scanner.nextLine();

        // Crea el nuevo jugador y lo agrega a la lista
        Jugador nuevoJugador = new Jugador(nombreUsuario, correo, contraseña);
        usuarios.add(nuevoJugador);

        System.out.println("Jugador registrado correctamente.");
    }

    /**
     * Método para que un jugador pueda enviar feedback sobre el juego.
     * @param scanner Escáner para leer la entrada del usuario.
     */
    private static void enviarFeedback(Scanner scanner) {
        System.out.print("Ingrese su nombre de usuario para enviar feedback: ");
        String nombreUsuario = scanner.nextLine();

        // Chequear si el usuario existe
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Jugador && usuario.getNombreUsuario().equals(nombreUsuario)) {
                System.out.print("Ingrese tipo de feedback (Errores, Jugabilidad, Gráficos): ");
                String tipoFeedback = scanner.nextLine();
                System.out.print("Describa el problema o sugerencia: ");
                String descripcion = scanner.nextLine();

                // Crear feedback y guardarlo
                Feedback nuevoFeedback = new Feedback(tipoFeedback, descripcion, nombreUsuario);
                feedbacks.add(nuevoFeedback);

                System.out.println("Feedback enviado correctamente.");
                return;
            }
        }
        System.out.println("Jugador no encontrado. Asegúrese de estar registrado.");
    }

    /**
     * Método para revisar todos los feedbacks enviados, accedido por el desarrollador.
     */
    private static void revisarFeedback() {
        if (feedbacks.isEmpty()) {
            System.out.println("No hay feedback disponible para revisión.");
        } else {
            System.out.println("Feedbacks registrados:");
            for (Feedback fb : feedbacks) {
                System.out.println(fb.mostrarFeedback());
            }
        }
    }
}

