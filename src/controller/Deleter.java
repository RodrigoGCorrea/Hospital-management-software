package controller;

import model.facilities.Room;
import model.people.Doctor;
import model.people.Nurse;
import model.people.Patient;

public class Deleter extends Controller{
    private void deleteRoom(Room room) {
        dataBase.roomList.remove(room);
    }

    private void deletePatient(Patient patient) {
        dataBase.patientList.remove(patient);
    }

    private void deleteDoctor(Doctor doctor) {
        dataBase.doctorList.remove(doctor);
    }

    private void deleteNurse(Nurse nurse) {
        dataBase.nurseList.remove(nurse);
    }

}
