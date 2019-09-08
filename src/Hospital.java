import people.Patient;
import people.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
//        Person joao = new Person("joao", "82237867704", "0", "o+", "M");
//        if (joao.check_cpf()) System.out.println("dale");
//        ArrayList<String> diseases = new ArrayList<>();
//        diseases.add("cold");
//        Patient maria = new Patient("maria", "16584021700", "21111997", "a+", "F", "amil", "305", diseases);
//        String name = maria.getName();
//        System.out.println(name);
        Hospital_functions HF = new Hospital_functions();
        HF.CreatePacient();
    }
}

class Hospital_functions {
    public Patient CreatePacient() {
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
        System.out.println("input Patient diseases: (type E to end disease list)");
        ArrayList<String> diseases = new ArrayList<String>();
        String disease = input.nextLine();
        while (disease != "END") {
            diseases.add(disease);
            disease = input.nextLine();
        }
        Patient patient = new Patient(name, cpf, birthDate, bloodType, gender, healthInsurance, room, diseases);
        return patient;
    }
}