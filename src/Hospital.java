import functions.Creation;
import people.Patient;

public class Hospital {
    public static void main(String[] args) {
        Creation handler = new Creation();
        Patient p1;
        p1 = handler.CreatePatient();
        System.out.println(p1.getName());
    }
}

