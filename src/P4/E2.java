package P4;

public class E2 {
    public static void main(String[] arg){
        int dia = 5;

        switch (dia) {
            case 1:
                System.out.println("Es Lunes, ¡inicio de semana!");
                break;
            case 2:
                System.out.println("Es Martes, ¡un día productivo!");
                break;
            case 3:
                System.out.println("Es Miércoles, mitad de la semana.");
                break;
            case 4:
                System.out.println("Es Jueves, ¡casi viernes!");
                break;
            case 5:
                System.out.println("Es Viernes, fin de semana a la vista.");
                break;
            case 6:
                System.out.println("Es Sábado, día de descanso.");
                break;
            case 7:
                System.out.println("Es Domingo, tiempo de relajarse.");
                break;
            default:
                System.out.println("Número inválido. Introduce un número del 1 al 7.");
        }
    }

}
