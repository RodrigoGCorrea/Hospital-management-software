package model.facilities;

import model.people.Patient;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int room;
    private List<Patient> patientList = new ArrayList<>();

    public Room(int room) {
        this.room = room;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public boolean addPatient(Patient patient) {
        for (Patient value : patientList) {
            if (value.getCpf().equals(patient.getCpf())) {
                return false;
            }
        }
        patientList.add(patient);
        return true;
    }
}
