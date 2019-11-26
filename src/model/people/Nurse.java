package model.people;

import model.misc.Cpf;

import java.util.ArrayList;

public class Nurse extends Staff {
    public Nurse(String name, Cpf cpf, String birthDate, String bloodType, String gender, ArrayList<Patient> patientsAssigned) {
        super(name, cpf, birthDate, bloodType, gender, patientsAssigned);
    }
}
