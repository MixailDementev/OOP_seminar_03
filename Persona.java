package OOP_seminar_03;

import java.util.Scanner;

public class Persona {
    String pFIO;
    String pSex;
    int pAge;

    public Persona(String PFIO, String PSex, int PAge) {
        this.pFIO = PFIO;
        this.pSex = PSex;
        this.pAge = PAge;
    }

    public String getpFIO() {
        return pFIO;
    }

    public String getpSex() {
        return pSex;
    }

    public int getpAge() {
        return pAge;
    }

    public boolean checkAddGroup(Group group) {
        System.out.println("Добавить в группу " + group.deptName + "?");
        Scanner in = new Scanner(System.in);
        System.out.println("0 - нет\n1 - да");
        int choice = in.nextInt();
        return choice != 0;
       
    }


}
