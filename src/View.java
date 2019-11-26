import controller.Creator;
import controller.Tracker;
import model.misc.Cpf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class View {

    private static boolean running = true;

    private static Creator creator = new Creator();
    private static Tracker tracker = new Tracker();


    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String command;

        while (running) {
            clear_console();
            show_main_menu();
            command = sc.nextLine();

            switch (command.toUpperCase()) {
                case "CP":
                    System.out.println("Inserir CPF do paciente: ");
                    String cpf = sc.nextLine();

                    if (tracker.searchPatient(cpf) != null) {
                        System.out.println("paciente já existente");
                        break;
                    }
                    Cpf newCpf = new Cpf(cpf);
                    if (!newCpf.checkCpf()) {
                        System.out.println("CPF invalido, favor digitar novamente: ");
                        newCpf.setCpf(sc.nextLine());
                    }

                    System.out.println("Inserir Nome do Paciente:");
                    String name = sc.nextLine();

                    System.out.println("Inserir data de nascimento: ");
                    String birthDate = sc.nextLine();

                    System.out.println("Inserir tipo sanguineo: ");
                    String bloodType = sc.nextLine();

                    System.out.println("Inserir genero: ");
                    String gender = sc.nextLine();

                    System.out.println("Inserir plano de saude: ");
                    String healthInsurance = sc.nextLine();

                    System.out.println("Inserir quarto: ");
                    String room = sc.nextLine();

                    System.out.println("Inserir problemas do paciente (\"final\" para encerrar): ");
                    ArrayList<String> diseases = new ArrayList<>();
                    String disease = sc.nextLine();
                    while (!disease.equals("final")){
                        diseases.add(disease);
                        disease = sc.nextLine();
                    }

                    creator.createPatient(name, newCpf, birthDate, bloodType, gender, healthInsurance, room, diseases);
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

        System.out.println("MENU");
        System.out.println("\n");
        System.out.println("criar -> Paciente [CP] - Doutor [CD] - Enfermeiro [CE]");
        System.out.println("procurar -> Paciente [PP] - Doutor [PD] - Enfermeiro [PE] - Quarto[PQ]");
        System.out.println("Mostrar Todos -> Paciente [MP] - Doutor [MD] - Enfermeiro [ME] - Quarto[MQ]");
        System.out.println("deletar -> Paciente [DP] - Doutor [DD] - Enfermeiro [DE]");
        System.out.println("sair -> [0]");
        System.out.print("> ");
    }


    private static void clear_console() throws IOException, InterruptedException {
//        new ProcessBuilder("clear").inheritIO().start().waitFor();
    }

}
