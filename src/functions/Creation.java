package functions;

import people.Doctor;
import people.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class Creation {
    public Patient CreatePatient() {
        Scanner input = new Scanner(System.in);
        System.out.println("input Patient name:");
        String name = input.nextLine();
        System.out.println("input Patient cpf: ");
        String cpf = input.nextLine();
        System.out.println("input Patient birth date: ");
        String birthDate = input.nextLine();
        System.out.println("input Patient blood type: ");
        String bloodType = input.nextLine();
        System.out.println("input Patient gender: ");
        String gender = input.nextLine();
        System.out.println("input Patient health insurance: ");
        String healthInsurance = input.nextLine();
        System.out.println("input Patient room: ");
        String room = input.nextLine();
        System.out.println("input Patient number of diseases: ");
        int NOfDiseases = input.nextInt();
        System.out.println("input Patient diseases: ");
        ArrayList<String> diseases = new ArrayList<>();
        for (int i=0; i < NOfDiseases + 1; i++) {
            String disease = input.nextLine();
            diseases.add(disease);
        }
        Patient aux = new Patient(name, cpf, birthDate, bloodType, gender, healthInsurance, room, diseases);
        while (!aux.check_cpf()){
            System.out.println("cpf invalido, favor digitar novamente: ");
            aux.setCpf(input.nextLine());
        }
        return aux;
    }

    public Doctor CreateDoctor() {
        Scanner input = new Scanner(System.in);
        
    }
}
