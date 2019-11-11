package people;

import java.util.ArrayList;

public class Doctor extends Staff{
    private ArrayList<String> specialties;


    public Doctor(String name, String cpf, String birthDate, String bloodType, String gender, int ID, float salary, boolean paid, ArrayList<Patient> patientsAssigned, ArrayList<String> specialties) {
        super(name, cpf, birthDate, bloodType, gender, ID, salary, paid, patientsAssigned);
        this.specialties = specialties;
    }

    public ArrayList<String> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(ArrayList<String> specialties) {
        this.specialties = specialties;
    }
}
