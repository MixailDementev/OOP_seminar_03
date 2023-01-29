package OOP_seminar_03;

public class Group extends Department {

    public Group(String GroupName) {
        setDeptName(GroupName);
    }

    public void addPeople(Persona persona) {
        workInDept.add(persona);
    }
}
