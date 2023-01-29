package OOP_seminar_03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> noDeptPeople = new ArrayList<>();
        Group depAcc = new Group("Accounting");
        Group depIT = new Group("IT");

        Main run = new Main();
        run.setPersona(noDeptPeople);
        run.addPersonaToDepartmen(noDeptPeople.get(0), depAcc);

    }

    public void setPersona(ArrayList<Persona> noDeptPeople) {

        Scanner in = new Scanner(System.in);
        String FIO;
        String Sex;
        int Age;
        System.out.println("-".repeat(25));
        System.out.println("Сортировка по параметру:");
        System.out.println("ФИО работника: ");
        FIO = in.nextLine();
        System.out.println("Пол работника: ");
        Sex = in.nextLine();
        System.out.println("Возраст работника: ");
        Age = in.nextInt();

        noDeptPeople.add(new Persona(FIO, Sex, Age));
        System.out.println(noDeptPeople);
    }

    public void addPersonaToDepartmen(Persona persona, Group group) {
        boolean check = persona.checkAddGroup(group);
        if (check) {
            group.addPeople(persona);
        } else {
            System.out.println("Отказ!");
        }
    }

    public void viewResultAddPersonaToGroup(Group group) {
        System.out.println("Работники отдела: ");
        System.out.println(group.workInDept);
    }

}
