package controller;

import model.people.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class Creation {
    public static Patient CreatePatient() {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserir Nome do Paciente:");
        String name = input.nextLine();
        System.out.println("Inserir CPF do paciente: ");
        String cpf = input.nextLine();
        System.out.println("Inserir data de nascimento: ");
        String birthDate = input.nextLine();
        System.out.println("Inserir tipo sanguineo: ");
        String bloodType = input.nextLine();
        System.out.println("Inserir genero: ");
        String gender = input.nextLine();
        System.out.println("Inserir plano de saude: ");
        String healthInsurance = input.nextLine();
        System.out.println("Inserir quarto: ");
        String room = input.nextLine();
        System.out.println("Inserir problemas do paciente (-1 para encerrar): ");
        ArrayList<String> diseases = new ArrayList<>();
        String disease = input.nextLine();
        while (!disease.equals("-1")){
            diseases.add(disease);
            disease = input.nextLine();
        }
        Room newRoom = new Room(room);
        Patient aux = new Patient(name, cpf, birthDate, bloodType, gender, healthInsurance, diseases, );
        while (!aux.check_cpf()){
            System.out.println("CPF invalido, favor digitar novamente: ");
            aux.setCpf(input.nextLine());
        }
        return aux;
    }

    public static void CreateDoctor() {
        Scanner input = new Scanner(System.in);
    }
}
