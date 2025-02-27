public class SwitchExampleNew {
    public static void main(String[] args) {
        System.out.println("Ejemplo switch después de Java 14");

        String diaSemana = "Lunes";

        String tipoDia = switch (diaSemana.toLowerCase()) {
            case "lunes" -> "Inicio de semana";
            case "martes", "miércoles", "jueves" -> "Mediados de semana";
            case "viernes" -> "Inicio de fin de semana";
            case "sábado", "domingo" -> "Fin de semana";
            default -> "Día no válido";
        };

        System.out.println(diaSemana + " es " + tipoDia);
    }
}
