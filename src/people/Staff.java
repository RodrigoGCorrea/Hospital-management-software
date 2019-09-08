package people;

public class Staff extends Person {
    private int ID;
    private float salary;
    private boolean paid;

    public Staff(String name, String cpf, String birthDate, String bloodType, String gender, int ID, float salary, boolean paid) {
        super(name, cpf, birthDate, bloodType, gender);
        this.ID = ID;
        this.salary = salary;
        this.paid = paid;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
