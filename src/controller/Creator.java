package controller;

import db.Db;
import model.facilities.Room;
import model.people.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class Creator extends Controller{

    public void CreatePatient() {
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
        String roomS = input.nextLine();
        System.out.println("Inserir problemas do paciente (-1 para encerrar): ");
        ArrayList<String> diseases = new ArrayList<>();
        String disease = input.nextLine();
        while (!disease.equals("-1")){
            diseases.add(disease);
            disease = input.nextLine();
        }

        Patient patient = new Patient(name, cpf, birthDate, bloodType, gender, healthInsurance, diseases);
        while (!patient.check_cpf()){
            System.out.println("CPF invalido, favor digitar novamente: ");
            patient.setCpf(input.nextLine());
        }

        for (Patient value : dataBase.patientList) {
            if (value.getCpf().equals(patient.getCpf())) {
                System.out.println("paciente já existente");
            } else {
                dataBase.patientList.add(patient);
            }
        }

        for (Room value : dataBase.roomList) {
            if (value.getRoom().equals(roomS)) {
                value.addPatient(patient);
            } else {
                Room room = new Room(roomS);
                room.addPatient(patient);
                dataBase.roomList.add(room);
            }
        }

    }

    public void CreateDoctor() {
        Scanner input = new Scanner(System.in);
    }
}
