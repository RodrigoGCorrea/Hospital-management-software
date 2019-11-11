package people;

import java.util.ArrayList;

public class Nurse extends Staff{
    private int floorAssigned;

    public Nurse(String name, String cpf, String birthDate, String bloodType, String gender, int ID, float salary, boolean paid, ArrayList<Patient> patientsAssigned, int floorAssigned) {
        super(name, cpf, birthDate, bloodType, gender, ID, salary, paid, patientsAssigned);
        this.floorAssigned = floorAssigned;
    }

    public int getFloorAssigned() {
        return floorAssigned;
    }

    public void setFloorAssigned(int floorAssigned) {
        this.floorAssigned = floorAssigned;
    }
}
