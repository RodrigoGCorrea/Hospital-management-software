package people;

import java.util.ArrayList;

public class Patient extends people.Person{

    private String healthInsurance;
    private String room;
    private ArrayList diseases;

    public Patient(String name, String cpf, String birthDate, String bloodType, String gender, String healthInsurance, String room, ArrayList diseases) {
        super(name, cpf, birthDate, bloodType, gender);
        this.healthInsurance = healthInsurance;
        this.room = room;
        this.diseases = diseases;
    }

    public String getHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(String healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
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
