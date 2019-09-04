import person.Person;

public class Hospital {
    public static void main(String[] args) {
        Person joao = new Person("joao", "99999999999", "0", "o+", "M");
        if (joao.check_cpf()) System.out.println("dale");
    }
}
