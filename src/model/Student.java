package model;
import java.util.Objects;

public class Student extends Human {
    private int Id;
    public int Id() {
        return Id;
    }
    public void Id(int Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return String.format("Student{recordBookNumber=%d, name='%s', surname='%s', patronymic='%s', sex=%s}",
                Id, name, surname, patronymic, sex);
    }

}
