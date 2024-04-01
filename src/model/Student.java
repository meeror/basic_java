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

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Student student)) return false;

        return Id == student.Id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }
}
