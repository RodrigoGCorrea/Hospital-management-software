package controller;

import model.facilities.Room;
import model.people.Doctor;
import model.people.Nurse;
import model.people.Patient;

import java.util.List;

public class Tracker extends Controller {

    //    search
    public Room searchRoom(String room) {
        for (Room value : dataBase.roomList) {
            if (value.getRoom().equals(room)) {
                return value;
            }
        }
        return null;
    }

    public Patient searchPatient(String cpf) {
        for (Patient value : dataBase.patientList) {
            if (value.getCpf().equals(cpf)) {
                return value;
            }
        }
        return null;
    }

    public Doctor searchDoctor(String cpf) {
        for (Doctor value : dataBase.doctorList) {
            if (value.getCpf().equals(cpf)) {
                return value;
            }
        }
        return null;
    }

    public Nurse searchNurse(String cpf) {
        for (Nurse value : dataBase.nurseList) {
            if (value.getCpf().equals(cpf)) {
                return value;
            }
        }
        return null;
    }

    //    show all
    public List<Room> showAllRooms() {
        return dataBase.roomList;
    }

    public List<Patient> showAllPatients() {
        return dataBase.patientList;
    }

    public List<Doctor> showAllDoctors() {
        return dataBase.doctorList;
    }

    public List<Nurse> showAllNurses() {
        return dataBase.nurseList;
    }

}
