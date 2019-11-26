package model.people;

import model.misc.Cpf;

import java.util.ArrayList;

public class Patient extends Person {

    private String healthInsurance;
    private ArrayList diseases;

    public Patient(String name, Cpf cpf, String birthDate, String bloodType, String gender, String healthInsurance, ArrayList diseases) {
        super(name, cpf, birthDate, bloodType, gender);
        this.healthInsurance = healthInsurance;
        this.diseases = diseases;
    }

    public String getHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(String healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    public ArrayList getDiseases() {
        return diseases;
    }

    public void setDiseases(ArrayList diseases) {
        this.diseases = diseases;
    }

    public void cureDisease(String disease){
        this.diseases.remove(disease);
    }
}
