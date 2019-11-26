package controller;

import db.Db;
import model.facilities.Room;
import model.misc.Cpf;
import model.people.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class Creator extends Controller{

    public void createPatient(String name, Cpf cpf, String birthDate, String bloodType, String gender, String healthInsurance, String room, ArrayList<String> diseases) {

        Patient patient = new Patient(name, cpf, birthDate, bloodType, gender, healthInsurance, diseases);

        boolean found = false;
        for (Room value : dataBase.roomList) {
            if (!value.getRoom().equals(room)) {
                value.addPatient(patient);
                found = true;
            }
        }
        if (!found) {
            Room newRoom = new Room(room);
            newRoom.addPatient(patient);
            dataBase.roomList.add(newRoom);
        }
        
        dataBase.patientList.add(patient);
    }

    public void CreateDoctor() {
        Scanner input = new Scanner(System.in);
    }
}
