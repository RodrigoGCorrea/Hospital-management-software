package model.people;

import model.misc.Cpf;

import java.util.ArrayList;

public class Staff extends Person {
    private ArrayList<Patient> PatientsAssigned;

    Staff(String name, Cpf cpf, String birthDate, String bloodType, String gender, ArrayList<Patient> patientsAssigned) {
        super(name, cpf, birthDate, bloodType, gender);
        PatientsAssigned = patientsAssigned;
    }

    public ArrayList<Patient> getPatientsAssigned() {
        return PatientsAssigned;
    }

    public void setPatientsAssigned(ArrayList<Patient> patientsAssigned) {
        PatientsAssigned = patientsAssigned;
    }
}
