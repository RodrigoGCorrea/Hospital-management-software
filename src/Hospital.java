import functions.Creation;
import people.Patient;

import java.io.IOException;
import java.util.Scanner;

public class Hospital {

    private static boolean running = true;

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String command;

        while (running) {
            clear_console();
            show_main_menu();
            command = sc.nextLine();

            switch (command.toUpperCase()) {
                case "CP":
                    Patient aux = new Creation().CreatePatient();
                    aux.save();
                    break;
                case "BQ":
                    System.out.println("Quartos");
                    break;
                case "BP":
                    System.out.println("Busca paciente");
                    break;
                case "AD":
                    System.out.println("Busca paciente");
                    break;
                case "AE":
                    System.out.println("Busca paciente");
                    break;
                case "AQ":
                    System.out.println("Busca paciente");
                    break;
                case "AS":
                    System.out.println("Busca paciente");
                    break;
                case "BD":
                    System.out.println("Busca paciente");
                    break;
                case "BE":
                    System.out.println("Busca paciente");
                    break;
                case "BS":
                    System.out.println("Busca paciente");
                    break;
                case "0":
                    running = false;
                    break;
                default:
                    System.out.println("Comando não válido");
            }

        }
    }

    private static void show_main_menu() {
        final String style_bars = "--------------";
        System.out.println(style_bars + "Hospital Management 0.1" + style_bars);
        System.out.println("\n");
        System.out.println(style_bars + "Check-in e busca" + style_bars);
        System.out.println("Check-in Paciente [CP] -- Quartos [BQ] -- Pacientes [BP]");
        System.out.println(style_bars + "Registro de funcionários" + style_bars);
        System.out.println("Doutor [AD] -- Enfermeiro [AE] -- Quarto [AQ] -- Staff [AS]");
        System.out.println(style_bars + "Busca de funcionários" + style_bars);
        System.out.println("Doutor [BD] -- Enfermeiro [BE] -- Staff [BS] ---- Exit [0]");
        System.out.print("> ");
    }


    private static void clear_console() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

}

