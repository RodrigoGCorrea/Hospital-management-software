package model.facilities;

import model.people.Patient;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String room;
    private List<Patient> patientList = new ArrayList<>();

    public Room(String room) {
        this.room = room;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void addPatient(Patient patient) {
        for (Patient value : patientList) {
            if (value.getCpf().equals(patient.getCpf())) {
                return;
            }
        }
        patientList.add(patient);
    }
}
