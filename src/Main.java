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
            case "miércoles":
            case "jueves":
                tipoDia = "Mediados de semana";
                break;
            case "viernes":
                tipoDia = "Inicio de fin de semana";
                break;
            case "sábado":
            case "domingo":
                tipoDia = "Fin de semana";
                break;
            default:
                tipoDia = "Día no válido";
        }

        System.out.println(diaSemana + " es " + tipoDia);
    }
}
