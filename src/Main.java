public class SwitchExampleOld {
    public static void main(String[] args) {
        System.out.println("Ejemplo switch antes de Java 14");

        String tipoDia = "";
        String diaSemana = "Lunes";

        switch (diaSemana.toLowerCase()) {
            case "lunes":
                tipoDia = "Inicio de semana";
                break;
            case "martes":
            case "miércoles":  // Corrección en "míercoles"
            case "jueves":
                tipoDia = "Mediados de semana";
                break;
            case "viernes":
                tipoDia = "Inicio de fin de semana"; // Corrección en "Inicio de fin se semana"
                break;
            case "sábado":
            case "domingo":
                tipoDia = "Fin de semana"; // Corrección en "Fin de seman"
                break;
            default:
                tipoDia = "Día no válido"; // Se añade un caso por defecto
        }

        System.out.println(diaSemana + " es " + tipoDia);
    }
}
